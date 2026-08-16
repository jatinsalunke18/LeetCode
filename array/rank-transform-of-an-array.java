class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int temp[] = arr.clone();
        Arrays.sort(temp);
        int rank = 1;
        for(int i=0;i<arr.length;i++){
            map.putIfAbsent(temp[i], rank);
            if (map.get(temp[i]) == rank) {
                rank++;
            }
        }
        int index[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            index[i] = map.get(arr[i]);
        }
        return index;
    }
}