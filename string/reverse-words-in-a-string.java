class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        String str = words[words.length-1];
        for(int i=words.length-2;i>=0;i--){
            if(words[i].length()>0){
                str+=(" "+words[i]);
            }
        }
        return str;
    }
}