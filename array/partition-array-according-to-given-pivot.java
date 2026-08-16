class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]<pivot){
                ans[i] = nums[j];
                i++;
            }
            j++;
        }
        j=0;
        while(j<nums.length){
            if(nums[j]==pivot){
                ans[i] = nums[j];
                i++;
            }
            j++;
        }
        j=0;
        while(j<nums.length){
            if(nums[j]>pivot){
                ans[i] = nums[j];
                i++;
            }
            j++;
        }
        return ans;
    }
}