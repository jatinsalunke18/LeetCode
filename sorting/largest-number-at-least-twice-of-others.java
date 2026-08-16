class Solution {
    public int dominantIndex(int[] arr) {
        int l = 0;
        int sl = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[l]){
                sl = l;
                l = i;
            }
            else if(arr[i] < arr[l] && arr[i] > arr[sl]){
                sl = i;
            }
        }
        if(arr[l]/2>=arr[sl]) return l;
        else return -1;
    }
}