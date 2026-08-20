class Solution {
    public int maxWidthRamp(int[] nums) {
        int max = 0;
        int i = 0;
        int j = nums.length-1;
        while(i<nums.length){
            if(i<nums.length-1 && nums[i]==nums[i+1]) max = Math.max(1,max);
            if(nums[i]<=nums[j]){
                max = Math.max(max,j-i);
            }
            i++;
        }
        return max;
    }
}