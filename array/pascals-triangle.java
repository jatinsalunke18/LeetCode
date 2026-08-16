class Solution {
    //NcR function - approach 1
    // public int NcR(int n,int c){
    //     int rem = 1;
    //     for(int i=1;i<c;i++){
    //         rem = rem * (n-i);
    //         rem = rem/(i);
    //     }
    //     return rem;
    // }

    public List<Integer> generateRow(int row){
        List<Integer> temp = new ArrayList<>();
        int ans = 1;
        temp.add(ans);
        for(int col = 1;col<row;col++){
            ans = ans * (row-col);
            ans = ans/col;
            temp.add(ans);
        }
        return temp;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            ans.add(generateRow(row));
        }
        return ans;
    }
}