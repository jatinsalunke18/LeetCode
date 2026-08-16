class Solution {
    private int check(List<Integer> nums,int val){
        if(!nums.contains(val)) return val;
        return check(nums,val*2);
    }
    public int findFinalValue(int[] nums, int original) {
        List<Integer> list = new ArrayList<>();
        for(int ele:nums) list.add(ele);
        return check(list,original);
    }
}