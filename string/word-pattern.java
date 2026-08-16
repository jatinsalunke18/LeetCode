class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> map = new HashMap();
        String s[] = str.split(" ");
        if(s.length!=pattern.length()) return false;
        for(int i=0;i<s.length;i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(s[i])) return false;
            }
            else map.put(pattern.charAt(i),s[i]);
        }
        HashMap<String,Character> map2 = new HashMap();
        for(int i=0;i<s.length;i++){
            if(map2.containsKey(s[i])){
                if(!map2.get(s[i]).equals(pattern.charAt(i))) return false;
            }
            else map2.put(s[i],pattern.charAt(i));
        }
        return true;
    }
}