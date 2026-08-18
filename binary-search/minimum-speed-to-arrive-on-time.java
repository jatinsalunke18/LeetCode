class Solution {
    int check(int[] nums,double mid){
        double ans = 0;
        for(int num:nums){
            ans+=num/mid;
        }
        return (int)Math.ceil(ans);
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        double low = 0;
        double high =0;
        for(int i=0;i<dist.length;i++){
            high = Math.max(high,dist[i]);
        }
        if(Math.ceil(hour)<high) return -1;
        while(low<=high){
            double mid = low+(high-low)/2;
            if(check(dist,mid)==hour) return (int)Math.ceil(mid);
            if(check(dist,mid)<hour) high = mid-1;
            else low = mid+1;
        }
        return (int)Math.ceil(low)-1;
    }
}