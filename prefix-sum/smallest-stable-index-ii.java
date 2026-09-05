class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] stable = new int[nums.length];
        int max= nums[0];
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            stable[i] = max;
        }
        int min = nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--){
            min = Math.min(min,nums[i]);
            stable[i]-=min;
            if(stable[i]<=k) return i;
        }
        return -1;
    }
}