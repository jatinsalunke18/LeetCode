class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int hashArray[] = new int[26];
       for(int i=0;i<magazine.length();i++){
            hashArray[magazine.charAt(i)-'a']++;
       } 
       for(int i=0;i<ransomNote.length();i++){
            hashArray[ransomNote.charAt(i)-'a']--;
            if(hashArray[ransomNote.charAt(i)-'a']<0) return false;
       }
       return true;
    }
}