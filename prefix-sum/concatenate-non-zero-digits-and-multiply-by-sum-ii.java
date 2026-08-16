class Solution {
    static final long MOD = 1000000007L;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();

        long[] sums = new long[n];
        long[] xarr = new long[n];
        int[] zeros = new int[n];
        long[] pow10 = new long[n + 1];

        pow10[0] = 1;
        for (int i = 1; i <= n; i++)
            pow10[i] = (pow10[i - 1] * 10) % MOD;

        long sum = 0;
        long x = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int d = s.charAt(i) - '0';

            sum = (sum + d) % MOD;
            sums[i] = sum;

            if (d != 0) {
                x = (x * 10 + d) % MOD;
                count++;
            }

            xarr[i] = x;
            zeros[i] = count;
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int l = queries[i][0];
            int r = queries[i][1];

            long digitSum = sums[r];
            if (l > 0)
                digitSum = (digitSum - sums[l - 1] + MOD) % MOD;

            long value;
            if (l == 0) {
                value = xarr[r];
            } else {
                int digits = zeros[r] - zeros[l - 1];
                value = (xarr[r] - xarr[l - 1] * pow10[digits]) % MOD;
                value = (value + MOD) % MOD;
            }

            ans[i] = (int) ((value * digitSum) % MOD);
        }

        return ans;
    }
}