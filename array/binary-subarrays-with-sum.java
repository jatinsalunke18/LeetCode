class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int last = 0;
        int j =  0;
        int sum = 0;
        for(int  i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum==goal) return (nums.length*(nums.length+1))/2;
        sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            while(j<i && sum>goal){
                sum -= nums[j];
                j++;
            }
            if(sum==goal){
                count+= i-last;
                last = i;
            }
        }
        return count;
    }
}