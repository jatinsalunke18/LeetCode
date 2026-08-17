class Solution {
    long power(long x,long n){
        long ans = 1;
        while(n>0){
            if(n%2==0){
                x = (x*x)%1000000007;
                n = n/2;
            }
            else{
                ans = (ans*x)%1000000007;
                n--;
            }
        }
        return ans;
    }

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;
        long ans = power(5, even);
        ans = (ans*power(4, odd))%1000000007;
        return (int) ans;
    }
}