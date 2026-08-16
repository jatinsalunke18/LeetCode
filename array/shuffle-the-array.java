class Solution {
    public int[] shuffle(int[] nums, int n) {
       int ans[] = new int[nums.length];
       int i=0;
       int j=0;
       int k=n;
       while(k<nums.length){
            ans[2*i] = nums[j++];
            ans[2*i+1] = nums[k++];
            i++;
       }
       return ans;
    }
}