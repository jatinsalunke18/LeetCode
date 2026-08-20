class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2) return nums.length;
        int i = 1;
        int j = 1;
        while(j<nums.length){
            if(nums[j-1]!=nums[j]){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
}