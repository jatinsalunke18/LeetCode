class Solution {
    public int maxProduct(int n) {
        List<Integer> arr = new ArrayList<>();
        while(n>0){
            int dig = n%10;
            n = n/10;
            arr.add(dig);
        }
        int left = 0;
        int right = arr.size()-1;
        int max = Integer.MIN_VALUE;
        while(left<right){
            max = Math.max(arr.get(left)*arr.get(right),max);
            if(arr.get(left)<=arr.get(right)) left++;
            else right--;
        }
        return max;
    }
}