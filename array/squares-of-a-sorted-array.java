class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            int val = 0;
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                val = nums[left];
                left++;
            }
            else {
                val = nums[right];
                right--;
            }
            ans[i] = (int)Math.pow(val,2);
        }
        return ans;
    }
}