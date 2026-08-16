class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == -1 && dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
        if(divisor == -1 && dividend == 2147483647) return -dividend;
        int sign = ((dividend<0) ^ (divisor<0))?-1:1;
        long divid = Math.abs((long)dividend);
        long divis = Math.abs((long)divisor);
        int count = 0;
        while(divid>=divis){
            divid -= divis;
            count++;
        }
        return (sign==-1)?-count:count;
    }
}