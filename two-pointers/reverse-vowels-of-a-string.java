class Solution {
    private boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    } 
    public String reverseVowels(String s) {
        char[] letters = s.toCharArray();
        int left = 0;
        int right = letters.length-1;
        while(left<right){
            if(isVowel(letters[left]) && isVowel(letters[right])){
                char temp = letters[left];
                letters[left] = letters[right];
                letters[right] = temp;
                left++;
                right--;
            }
            else if(!isVowel(letters[left])) left++;
            else right--;
        }
        return new String(letters);
    }
}