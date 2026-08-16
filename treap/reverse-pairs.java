class Solution {
    public void merge(int arr[],int low,int mid,int high){
        int left = low;
        int right = mid+1;
        List<Integer> temp = new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
    }
    public int countpair(int arr[],int low,int mid,int high){
        int count = 0;
        int right = mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && arr[i]>2L*arr[right]) right++;
            count += right-(mid+1);
        }
        return count;
    }
    public int ms(int arr[],int low,int high){
        int count = 0;
        if(low>=high) return count;
        int mid =low + (high - low) / 2;
        count += ms(arr,low,mid);
        count += ms(arr,mid+1,high);
        count += countpair(arr,low,mid,high);
        merge(arr,low,mid,high);
        return count;
    }
    public int reversePairs(int[] nums) {
        return ms(nums,0,nums.length-1);
    }
}