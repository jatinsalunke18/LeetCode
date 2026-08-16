class Solution {
    public void gameOfLife(int[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                int count = 0;
                if(i-1>=0 && (board[i-1][j]==1||board[i-1][j]==-1)) count++;
                if(i+1<board.length && (board[i+1][j]==1||board[i+1][j]==-1)) count++;
                if(j-1>=0 && (board[i][j-1]==1||board[i][j-1]==-1)) count++;
                if(j+1<board[i].length && (board[i][j+1]==1|| board[i][j+1]==-1)) count++;
                if(j+1<board[i].length && i-1>=0 && (board[i-1][j+1]==1||board[i-1][j+1]==-1)) count++;
                if(j+1<board[i].length && i+1<board.length && (board[i+1][j+1]==1||board[i+1][j+1]==-1)) count++;
                if(j-1>=0 && i-1>=0 && (board[i-1][j-1]==1||board[i-1][j-1]==-1)) count++;
                if(j-1>=0 && i+1<board.length && (board[i+1][j-1]==1||board[i+1][j-1]==-1)) count++;
                if((count<2)&&board[i][j]==1) board[i][j] = -1; 
                if((count>3)&&board[i][j]==1) board[i][j] = -1;
                if(count==3 && board[i][j]==0) board[i][j] = 2;
                if((count==2 ||count==3)&&board[i][j]==1) board[i][j] = 1;
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==-1) board[i][j] = 0;
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==2) board[i][j] = 1;
            }
        }
    }
}