class Solution {
    int func(int n,int first,int second,int third){
        if(n==0) return first;
        int ans = first+second+third;
        return func(n-1,second,third,ans);
    }
    public int tribonacci(int n) {
        return func(n,0,1,1);
    }
}