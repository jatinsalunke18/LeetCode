class Solution {
    long check(int[] nums,int n,int k){
        long count = 0;
        long bouquets = 0;
        for(int num:nums){
            if(num<=n){
                count++;
                if(count==k){
                    count = 0;
                    bouquets++;
                }
            }
            else{
                count =0;
            }
        }
        return bouquets;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        if(m*k>bloomDay.length) return -1;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<low) low = bloomDay[i];
            if(bloomDay[i]>high) high = bloomDay[i];
        }
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(check(bloomDay,mid,k)>=m){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
                
            }
        }
        return ans;
    }
}