class Solution {
    int func(int ind,int tind,String s,String t){
        if(tind==t.length()) return 1;
        if(ind==s.length()) return 0;
        
        int cnt = 0;

        if(s.charAt(ind)==t.charAt(tind)){
            cnt+=func(ind+1,tind+1,s,t);
        }
        cnt += func(ind + 1, tind, s, t);

        return cnt;
    }
    public int numDistinct(String s, String t) {
        return func(0,0,s,t);
    }
}