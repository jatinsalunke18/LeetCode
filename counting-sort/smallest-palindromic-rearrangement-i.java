class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        int chars[] = new int[26];
        char middle = 'A';
        for(int i=0;i<s.length();i++){
            chars[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            int n = chars[i]/2;
            while(n-->0){
                ans.append((char)('a' + i));
            }
        }

        for(int i=25;i>=0;i--){
            if(chars[i]%2!=0){
                middle = (char)('a' + i);
            }
        }
        if(middle=='A') return ans.toString()+(ans.reverse()).toString();
        return ans.toString()+(middle)+(ans.reverse()).toString();
    }
}