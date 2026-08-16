class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        while(i<name.length()&&j<typed.length()){
            if(name.charAt(i)!=typed.charAt(j)){
                return false;
            }
            i++;
            j++;
            while(i<name.length() && j<typed.length() && name.charAt(i)!=typed.charAt(j) &&typed.charAt(j-1)==typed.charAt(j)) j++;
        } 
        while(j<typed.length() && typed.charAt(j-1)==typed.charAt(j)) j++;
        return i==name.length() && j==typed.length();
    }
}