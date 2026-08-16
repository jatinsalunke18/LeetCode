class Solution {
        static{
        for(int i = 0; i < 300; i++){
            imageSmoother(new int[][]{{0}});
        }
    }
    public static int[][] imageSmoother(int[][] img) {
        int[][] ans = new int[img.length][img[0].length];
        for(int i=0;i<img.length;i++){
            for(int j=0;j<img[i].length;j++){
                int sum = 0;
                int count = 1;
                sum+=img[i][j];
                if(i-1>=0){
                    sum+= img[i-1][j];
                    count++;
                }
                if(j-1>=0){
                    sum+=img[i][j-1];
                    count++;
                }
                if(i+1<img.length){
                    sum+=img[i+1][j];
                    count++;
                }
                if(j+1<img[0].length){
                    sum+=img[i][j+1];
                    count++;
                }
                if(i+1<img.length && j-1>=0){
                    sum+=img[i+1][j-1];
                    count++;
                }
                if(i+1<img.length && j+1<img[0].length){
                    sum+=img[i+1][j+1];
                    count++;
                }
                if(i-1>=0 && j-1>=0){
                    sum+=img[i-1][j-1];
                    count++;
                }
                if(i-1>=0 && j+1<img[0].length){
                    sum+=img[i-1][j+1];
                    count++;
                }
                ans[i][j] = sum/(count);
            }
        }
        return ans;
    }
}