class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix[0].length;
        int m = matrix.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int cur = matrix[i][j];
                int k = i;
                int l = j;
                while(k<m && l<n){
                    if(cur != matrix[k][l]) return false;
                    l++;
                    k++;
                }
            }
        }
        return true;
    }
}