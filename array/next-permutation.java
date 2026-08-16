class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        //Searching the element greater than its consecutive leaving the last element
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind = i;
                break;
            }
        }
        if(ind==-1){
            int left = 0;
            int right = nums.length-1;
            while(left<=right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            return;
        }
        for(int i=nums.length-1;i>=ind;i--){
            if(nums[i]>nums[ind]){
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
                break;
            }
        }
        int left = ind+1;
        int right = nums.length-1;
        while(left<=right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
        }
    }
}