class Solution {
    public void dfs(ArrayList<ArrayList<Integer>> adj , int a , boolean vis[]){
        if(vis[a]) return;
        vis[a] = true;
        for(int b:adj.get(a)){
            dfs(adj,b,vis);
        }
    }
    public int findCircleNum(int[][] isconnected) {
        ArrayList<ArrayList<Integer>> adj;
        adj = new ArrayList<>();  
        for(int i=0;i<isconnected.length;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<isconnected.length;i++){
            for(int j=0;j<isconnected[0].length;j++){
                if(isconnected[i][j]==1){
                    int src = i;
                    int des = j;
                    adj.get(src).add(des);
                }
            }
        }
        int count = 0;
        boolean[] vis = new boolean[isconnected.length];
        for(int i = 0 ; i<vis.length ; i++){
            if(vis[i]) continue;
            dfs(adj,i,vis);
            count++;
        }
        return count;
    }
}