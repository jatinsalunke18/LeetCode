class Solution {
    public int helper(String str){
        int count = 1;
        for(int j=0;j<str.length();j++){
            if(str.charAt(j)==' ') count++;
        }
        return count;
    }
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String str:sentences){
            int count = helper(str);
            max = Math.max(max,count);
        }
        return max;
    }
}