class Solution {
    public int largestAltitude(int[] gain) {
        int max = gain[0];
        int prev = 0;
        for(int i=0;i<gain.length;i++){
            int cur = gain[i]+prev;
            max = Math.max(cur,max);
            prev = cur;
        }
        if(max < 0)return 0;
        return max;
    }
}