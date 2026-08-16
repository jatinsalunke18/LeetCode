class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int ele:nums) set.add(ele);
        int max = Integer.MIN_VALUE;
        
        for(int ele:set){
            if(!set.contains(ele-1)){
                int count = 0;
                int curr = ele;
                while(set.contains(curr)){
                    count++;
                    curr++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}