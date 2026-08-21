class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String word1 = strs[0];
        String word2 = strs[strs.length-1];
        int i=0;
        while(word1.charAt(i)==word2.charAt(i)){
            i++;
        }
        return strs[0].substring(0,i);
    }
}