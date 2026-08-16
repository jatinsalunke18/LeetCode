class Solution {
    public int fib(int n) {
        if(n==1 || n==0) return n;

        int a = 0;
        int b = 1;
        int fib = 0;
        for(int i=1;i<n;i++){
            fib = b + a;
            a = b;
            b = fib; 
        }
        return fib;
        // if(n==1) return 1;
        // if(n==0) return 0;
        // return fib(n-1)+fib(n-2);
    }
}