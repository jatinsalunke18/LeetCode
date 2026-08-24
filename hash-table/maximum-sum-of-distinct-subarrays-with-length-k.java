class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int maxsum = 0;
        int sum = 0;
        for (int i = 0; i < nums.length - k; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }
            if (set.size() == k) {
                for (int j = i; j < i + k; j++) {
                    sum += nums[j];
                }
                maxsum = Math.max(sum,maxsum);
            }
            sum = 0;
        }
        return maxsum;
    }
}