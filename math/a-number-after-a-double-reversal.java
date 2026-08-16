class Solution {
    private int rev(int num){
        int rev = 0;
        while(num!=0){
            rev = rev*10+(num%10);
            num = num/10;
        }
        return rev;
    }
    public boolean isSameAfterReversals(int num) {
        int og = num;
        int rev1 = rev(num);
        int rev2 = rev(rev1);
        if(og == rev2) return true;
        return false;
    }
}