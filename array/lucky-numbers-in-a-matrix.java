class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int arr[] = new int[matrix[0].length];
        for(int i=0;i<matrix[0].length;i++){
            int max = matrix[0][i];
            for(int j=0;j<matrix.length;j++){
                if(max < matrix[j][i]){
                    max = matrix[j][i];
                }
            }
            arr[i] = max;
        }

        for(int i=0;i<matrix.length;i++){
            int max = matrix[i][0];
            for(int j=0;j<matrix[0].length;j++){
                if(max > matrix[i][j]){
                    max = matrix[i][j];
                }
            }
            for(int ele:arr){
                if(ele==max) ans.add(max);
            }
        }
        return ans;
    }
}