class Solution {
    public boolean isValidSudoku(char[][] board) {
                
        HashMap<Integer, HashSet<Character>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Character>> colms = new HashMap<>();
        HashMap<Integer, HashSet<Character>> boxes = new HashMap<>();
        
        for (int i = 0; i < 9; i++) {
            rows.put(i, new HashSet<>());
            colms.put(i, new HashSet<>());
            boxes.put(i, new HashSet<>());
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                
                if (num == '.') continue;
                
                // Calculate which 3x3 box we are in
                int boxIndex = (i / 3) * 3 + (j / 3);
                
                // Check if the number already exists in current row, column, or box
                if (rows.get(i).contains(num) || 
                    colms.get(j).contains(num) || 
                    boxes.get(boxIndex).contains(num)) {
                    return false;
                }
                
                // Add the number to the respective sets
                rows.get(i).add(num);
                colms.get(j).add(num);
                boxes.get(boxIndex).add(num); 
            }
        }
        return true;
    }
}


