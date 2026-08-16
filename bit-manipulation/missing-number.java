class Solution {
    public int missingNumber(int[] nums) {
        int arr_sum = 0;
        int act_sum = 0;
        for(int ele:nums){
            arr_sum+=ele;
        }
        for(int i=1;i<=nums.length;i++){
            act_sum+=i;
        }
        return act_sum - arr_sum;
    }
}