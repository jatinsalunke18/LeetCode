class Solution {
    public int maxOperations(int[] arr, int k) {
        int cnt = 0;
        ArrayList<Integer> set = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int rem = k - arr[i];
            if(set.contains(rem)){
                cnt++;
                set.remove(Integer.valueOf(rem));
            }
            else set.add(arr[i]);
        }
        return cnt;
    }
}