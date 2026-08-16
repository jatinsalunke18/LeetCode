class Solution {
    public boolean canAliceWin(int[] nums) {
        int singl = 0;
        int doubl = 0;
        for(int i=0;i<nums.length;i++){
            if((int)Math.log10(nums[i])==0){
                singl += nums[i];
            }
            else{
                doubl += nums[i];
            }
        }
        if(singl<doubl||doubl<singl) return true;
        return false;
    }
}