class Solution {
    public boolean uniformArray(int[] nums1) {
        int even = 0;
        int odd = 0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0) even++;
            else odd++;
        }
        if(even==0||odd==0) return true;
        else if(even==odd) return false;
        return true;
    }
}