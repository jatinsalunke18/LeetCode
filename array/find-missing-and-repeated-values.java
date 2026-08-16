class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
      long n = grid.length*grid[0].length;
      long s = 0;
      long s2 = 0;
      long sn = (n*(n+1))/2;
      long s2n = (n*(n+1)*(2*n+1))/6;
      for(int[] row:grid){
        for(int ele:row){
            s+=ele;
            s2+=(long)Math.pow(ele,2);
        }
      } 
      long sum1 = s-sn;
      long sum2 = s2-s2n;
      sum2 = sum2/sum1;
      long x = (sum2+sum1)/2;
      long y = sum2-x;
      return new int[]{(int)x,(int)y};
    }
}