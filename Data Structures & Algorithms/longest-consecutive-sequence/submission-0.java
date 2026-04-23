class Solution {
    public static boolean contains(int [] nums,int target){
        for(int num:nums){
            if(num==target){
                return true;
            }
        }
        return false;
    }
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n=nums.length;
        int longest=0;
        for(int i=0;i<n;i++){
            int current=nums[i];
            int count=1;
            while(contains(nums,current+1)){
                current=current+1;
                count++;
            }
            longest=Math.max(longest,count); 
        }
        return longest;
    }
}
