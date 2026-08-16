class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("-","");
        StringBuilder str = new StringBuilder();
        int j = 1;
        for(int i=s.length()-1;i>=0;i--){
            if(j++%k==0){
                str.append(Character.toUpperCase(s.charAt(i))+"-");
            }
            else str.append(Character.toUpperCase(s.charAt(i))+"");
        }
        str = str.reverse();
        if(str.length()>0 && str.charAt(0)=='-') str.deleteCharAt(0);
        return str.toString();
    }
}