class Solution {
    public int minimumLength(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) break;
            while(s.charAt(left)==s.charAt(left+1)) left++;
            while(s.charAt(right-1)==s.charAt(right)) right--;
            left++;
            right--; 
        }
        return Math.max(0,(right-left)+1);
    }
}