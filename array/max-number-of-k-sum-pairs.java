class Solution {
    public int maxOperations(int[] arr, int k) {
        int cnt = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int rem = k - arr[i];
            if(set.contains(rem)){
                cnt++;
                set.remove(rem);
            }
            else set.add(arr[i]);
        }
        return cnt;
    }
}