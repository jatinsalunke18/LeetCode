class Solution {
    public int maxWidthRamp(int[] nums) {
        int max = 0;
        int i = 0;
        int j = 1;
        int k = nums.length-1;
        while(j<nums.length){
            if(j<nums.length-1 && nums[j]==nums[j+1]) max = Math.max(1,max);
            if(nums[i]<=nums[j]){
                max = Math.max(max,j-i);
                if(nums[i]<=nums[k])max = Math.max(max,k-i);
                j++;
            }
            else if(nums[i]>nums[k])i++;
            else j++;
        }
        return max;
    }
}