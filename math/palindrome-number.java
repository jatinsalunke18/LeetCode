class Solution {
    public boolean isPalindrome(int n) {
        int og = n;
        int dig = 0;
        int ans = 0;
        while(n>0){
            dig = n%10;
            n = n/10;
            ans = ans*10+dig;
        }
        if(ans == og) return true;
        else return false;
    }
}