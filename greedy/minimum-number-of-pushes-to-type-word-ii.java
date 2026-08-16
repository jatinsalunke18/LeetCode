class Solution {
    public int minimumPushes(String word) {
        int count = 0;
        int total = 0;

        int chars[] = new int[26];
        for(int i=0;i<word.length();i++){
            chars[word.charAt(i)-'a']++;
        }
        Arrays.sort(chars);
        for(int i=25;i>=0;i--){
            if(chars[i]==0) continue;
            int key = (count/8)+1;
            total += key*chars[i];
            count++;
        }
        return total;
    }
}