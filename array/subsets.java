class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    private void subarrays(int i,int[] arr,List<Integer> list){
        if(i==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        //Not take condition
        subarrays(i+1,arr,list);
        //take conditon
        list.add(arr[i]);
        subarrays(i+1,arr,list);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        subarrays(0,nums,list);
        return ans;
    }
}