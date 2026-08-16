class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int arr[] = new int[grid.length*grid[0].length];
        k = k%arr.length;
        int p = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                arr[p++] = grid[i][j];
            } 
        }
        int left = 0;
        int right = arr.length-k-1;
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        left = arr.length-k;
        right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        left = 0;
        right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        p=0;
        for(int i=0;i<grid.length;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                temp.add(arr[p++]);
            }
            ans.add(temp);
        }
        return ans;
    }
}