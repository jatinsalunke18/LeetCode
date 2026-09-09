class Solution {
    long cnt = 0;

    long func(long n) {
        long len = (long) Math.log10(n);
        if (len < 3) return cnt;
        long p = (long) Math.pow(10, len);
        cnt += (n - p + 1) * (len / 3);
        return func(p - 1);
    }

    public long countCommas(long n) {
        return func(n);
    }
}