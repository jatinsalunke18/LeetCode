class Solution {
    public int gcd(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;   
    }
    public long gcdSum(int[] nums) {
        int max = 0;
        int prefixGcd[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            prefixGcd[i] = gcd(max,nums[i]);
        }
        int left=0;
        int right = nums.length-1;
        long sum = 0;
        Arrays.sort(prefixGcd);
        while(left<right){
            sum+=gcd(prefixGcd[left],prefixGcd[right]);
            left++;
            right--;
        }
        return sum;
    }
}