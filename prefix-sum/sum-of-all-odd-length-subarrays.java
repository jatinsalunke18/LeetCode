class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = j - i + 1;
                if (sum % 2 != 0) {
                    for (int k = i; k <= j; k++) {
                        ans += arr[k];
                    }
                }
            }
        }
        return ans;
    }
}