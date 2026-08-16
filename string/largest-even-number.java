class Solution {
    public String largestEven(String s) {
        int n = s.length();
        for(int i = n-1;i>=0;i--){
            if(s.charAt(i) == '2'){
                return s;
            }
            s = s.substring(0,s.length()-1);
        }
        return s;
    }
}