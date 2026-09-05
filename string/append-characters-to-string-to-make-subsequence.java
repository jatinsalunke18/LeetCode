class Solution {
    public int appendCharacters(String s, String t) {
        int i=0;
        while(i<t.length() && s.charAt(i)==t.charAt(i)) i++;
        return t.length()-i;
    }
}