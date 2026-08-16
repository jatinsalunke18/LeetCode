class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        String str = Integer.toString(n);
        int k=1;
        for(int i=0;i<str.length();i++){
            sum+=(str.charAt(i)-'0')*k;
            k = k*-1;
        }
        return sum;
    }
}