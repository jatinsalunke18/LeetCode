class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int sum = 0;
            while(num>0){
                int dig = num%10;
                num = num/10;
                sum += dig;
            }
            nums[i] = sum;
            min = Math.min(min,nums[i]);
        }
        return min;
    }
}