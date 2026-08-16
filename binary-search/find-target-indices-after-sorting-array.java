class Solution {
    public void sorting(int arr[]){
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public List<Integer> targetIndices(int[] nums, int target) {
        sorting(nums);
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==target){
                list.add(i);
            }
        }
        return list;
    }
}