class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxsum = 0;
        long sum = 0;
        for (int i = 0; i <=nums.length - k; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }
            if (set.size() == k) {
                for (int j = i; j < i + k; j++) {
                    sum += nums[j];
                }
                System.out.println(sum);
                maxsum = Math.max(sum,maxsum);
            }
            sum = 0;
        }
        return maxsum;
    }
}