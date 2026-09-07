class Solution {
    public int mod = (int) 1e9+7;
    void func(int ind,String s,StringBuilder temp,HashSet<String> ans){
        if(ind==s.length()){
            if(temp.length()!=0) ans.add(temp.toString());
            return;
        }
        temp.append(s.charAt(ind));
        func(ind+1,s,temp,ans);
        temp.deleteCharAt(temp.length()-1);
        func(ind+1,s,temp,ans);
    }
    public int distinctSubseqII(String s) {
        HashSet<String> ans = new HashSet<>();
        StringBuilder temp = new StringBuilder();
        func(0,s,temp,ans);
        return ans.size()%mod;
    }
}