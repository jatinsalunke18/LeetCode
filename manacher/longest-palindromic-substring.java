class Solution {
    Boolean isPallindrome(String s,int left,int right){
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left<=right){
            if(isPallindrome(s,left,right)){
                StringBuilder ans = new StringBuilder();
                for(int i=left;i<=right;i++){
                    ans.append(s.charAt(i));
                }
                return ans.toString();
            }
            if(isPallindrome(s,left,right-1)) right--;
            else left++;
        }
        return "";
    }
}