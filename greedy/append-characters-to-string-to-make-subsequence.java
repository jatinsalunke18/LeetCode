class Solution {
    public int appendCharacters(String s, String t) {
        if(s.contains(t)) return 0;
        int i=0;
        while(i<t.length() && s.charAt(i)==t.charAt(i)) i++;
        return t.length()-i;
    }
}