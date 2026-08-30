class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length<3) return nums.length;
        int minInd = 0;
        int maxInd = 0;
        int min = nums[0];
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                maxInd = i;
            }
            if(nums[i]<min){
                min = nums[i];
                minInd = i;
            }
        }
        if(maxInd>=nums.length/2 && minInd>=nums.length/2) return Math.min(maxInd,minInd)+1;
        if(minInd<=nums.length/2 && maxInd>=nums.length/2) return minInd+(nums.length-maxInd)+1;
        if(maxInd<=nums.length/2 && minInd>=nums.length/2) return maxInd+(nums.length-minInd)+1;
        return Math.max(maxInd,minInd)+1;
    }
}