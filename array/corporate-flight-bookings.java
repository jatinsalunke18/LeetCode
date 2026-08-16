class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int ans[] = new int[n];
        for(int i=0;i<bookings.length;i++){
            int start = bookings[i][0];
            int end  = bookings[i][1];
            int val = bookings[i][2];
            ans[start-1] += val;
            if(end<n) {
                ans[end] -=val; 
            }
        }
        for(int i=1;i<n;i++){
            ans[i] +=ans[i-1];
        }
        return ans;
    }
}