class Solution {
    public int maxProduct(int[] nums) {
       int max = 0;
       int i = 0;
       int j = nums.length-1;
       while(i<j){
        max = Math.max((nums[i]-1)*(nums[j]-1),max);
        if(nums[i]<nums[j]) i++;
        else j--;
       }
       return max;
    }
}