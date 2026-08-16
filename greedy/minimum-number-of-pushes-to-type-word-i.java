class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        int a = len/8;
        int b = len%8;
        return 8*a*(a+1)/2+b*(a+1);
    }
}