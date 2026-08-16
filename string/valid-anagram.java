class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars = new char[26];
        for(int i=0;i<s.length();i++){
            chars[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            chars[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(chars[i]>0) return false;
        }
        return true;
    }
}