class Solution {
    public int minPairSum(int[] nums) {
        int max = 0;
        int sum = 0;
        int i=0;
        int j=nums.length-1;
        Arrays.sort(nums);
        while(i<j){
            sum = nums[i]+nums[j];
            max = (int)Math.max(max,sum);
            i++;
            j--;
        }
        return max;
    }
}