class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int j = 1;
        int k = 2;
        while(k<nums.length){
            if(nums[j]!=nums[k]){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                i++;
                j=j+2;
                k+=2;
            }
            else {
                j++;
                k++;
            }
        }
        return i;
    }
}