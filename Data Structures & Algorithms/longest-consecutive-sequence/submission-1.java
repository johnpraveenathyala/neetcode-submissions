class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int maxCount=0;
        for(int num:nums){
            if(!set.contains(num-1)){
               int  current=num;
               int count=1;
               while(set.contains(current+1)){
                   current++;
                   count++;
               }
               maxCount=Math.max(maxCount,count);
            }
        }
        return maxCount;
    }
}
