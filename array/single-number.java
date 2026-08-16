class Solution {
    public int singleNumber(int[] nums) {
        int num = 0;
        for(int ele:nums){
            num ^= ele;
        }
        return num;
    }
}