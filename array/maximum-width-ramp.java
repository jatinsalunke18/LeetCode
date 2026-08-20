class Solution {
    public int maxWidthRamp(int[] nums) {
        int max = 0;
        int i = 0;
        int j = nums.length-1;
        while(i<nums.length && nums[i]>nums[j]) i++;
        return j-i;
    }
}