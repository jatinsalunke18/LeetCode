class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        for(int i=0;i<s.length()-k;i++){
            int cnt = 0;
            for(int j=i;j<i+k;j++){
                if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(i)=='u') cnt++;
            }
            max = Math.max(max,cnt);
        }
        return max;
    }
}