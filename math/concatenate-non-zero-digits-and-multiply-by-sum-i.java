class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long ans = 0;
        int i = 0;
        while(n>0){
            int dig = n%10;
            n = n/10;
            if(dig!=0){
                ans = ans + dig*(long)Math.pow(10,i);
                sum += dig;
                i++;
            }
        }

        return ans*sum;
    }
}