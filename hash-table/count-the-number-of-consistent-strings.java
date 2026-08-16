class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int chars[] = new int[26];
        for(int i=0;i<allowed.length();i++){
            chars[allowed.charAt(i)-'a'] = 1;
        }
        int ans = 0;
        for(String str:words){
            int count = 0;
            for(int i=0;i<str.length();i++){
                if(chars[str.charAt(i)-'a']!=0){
                    count++;
                }
                else break;
            }
            if(count==str.length()) ans++;
        }
        return ans;
    }
}