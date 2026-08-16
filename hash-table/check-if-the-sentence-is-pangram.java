class Solution {
    public boolean checkIfPangram(String sentence) {
        String check = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<check.length();i++){
            if(!sentence.contains(check.charAt(i)+"")) return false;
        }
        return true;
    }
}