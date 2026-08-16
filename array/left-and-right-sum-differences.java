class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int leftsum = 0;
            int rightsum = 0;
            int left=0;
            int right=nums.length-1;
            while(left<i){
                leftsum += nums[left];
                left++;
            }
            while(right>i){
                rightsum += nums[right];
                right--;
            }
            ans[i] = (int)Math.abs(leftsum-rightsum);
        }
        return ans;
    }
}