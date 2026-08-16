class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int max = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0,j=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                max++;
                i++;
            }
            j++;
        }
        return max;
    }
}