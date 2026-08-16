class Solution {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        int chars[] = new int[26];
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        for(int i=0;i<row1.length();i++){
            chars[row1.charAt(i)-'a'] = 1;
        }
        for(int i=0;i<row2.length();i++){
            chars[row2.charAt(i)-'a'] = 2;
        }
        for(int i=0;i<row1.length();i++){
            chars[row1.charAt(i)-'a'] = 3;
        }
        for(String word:words){
            String temp = word.toLowerCase();
            boolean flag = true;
            for(int i=1;i<temp.length();i++){
                if(chars[temp.charAt(i-1)-'a']!=chars[temp.charAt(i)-'a']){
                    flag = false;
                    continue;
                }
            }
            if(flag) list.add(word);
        }
        return list.toArray(String[]::new);
    }
}