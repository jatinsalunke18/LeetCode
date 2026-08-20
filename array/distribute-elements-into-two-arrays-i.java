class Solution {
    public int[] resultArray(int[] nums) {
        int ans[] = new int[nums.length];
        int i=0;
        int j=(nums.length+1)/2;
        int k = 0;
        ans[i++] = nums[k++];
        ans[j++] = nums[k++];
        while(k<nums.length && i<(nums.length+1)/2 && j<nums.length){
            if(ans[k-2]>ans[k-1]) ans[i++] =  nums[k++];
            else ans[j++] = nums[k++];
        }
        while(k<nums.length && i<(nums.length+1)/2) ans[i++] = nums[k++];
        while(k<nums.length && j<nums.length) ans[j++] = nums[k++];
        return ans;
    }
}