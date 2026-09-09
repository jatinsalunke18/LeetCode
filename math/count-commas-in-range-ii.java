class Solution {
    long cnt = 0;

    long func(long n) {
        long len = (long) Math.log10(n);
        if (len < 3) return cnt;
        cnt += (n - (long) Math.pow(10, len) + 1) * (len / 3);
        return func((long) Math.pow(10, len - 3));
    }

    public long countCommas(long n) {
        return func(n);
    }
}