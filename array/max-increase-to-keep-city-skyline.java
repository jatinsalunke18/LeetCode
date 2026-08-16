class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
    //   int row[] = new int[grid.length];  
    //   int col[] = new int[grid.length];
      int sum = 0; 
    //   for(int i=0;i<grid.length;i++){
        
    //     row[i] = tempmax;
    //   } 
    //   for(int i=0;i<grid.length;i++){
        
    //     col[i] = tempmax;
    //   }
      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid.length;j++){
            int rowmax = grid[i][0];
            for(int k=0;k<grid.length;k++){
                if(rowmax<grid[i][k]) rowmax = grid[i][k];
            }
            int colmax = grid[0][j];
            for(int k=0;k<grid.length;k++){
                if(colmax<grid[k][j]) colmax = grid[k][j];
            }
            sum += Math.abs(Math.min(rowmax,colmax)-grid[i][j]);
        }
    }
      return sum;
    }
}