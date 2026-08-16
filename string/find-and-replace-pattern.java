class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans  = new ArrayList<>();
        for(String word : words){
            boolean flag = true;
            int i=0;
            HashMap<Character,Character> map = new HashMap<>();
            HashMap<Character,Character> map2 = new HashMap<>();
            while(i<pattern.length()){
                if(map.containsKey(word.charAt(i))){
                    if(map.get(word.charAt(i))!=pattern.charAt(i)){
                        flag = false;
                        break;
                    }
                }
                map.put(word.charAt(i),pattern.charAt(i));
                if(map2.containsKey(pattern.charAt(i))){
                    if(map2.get(pattern.charAt(i))!=word.charAt(i)){
                        flag = false;
                        break;
                    }
                }
                map2.put(pattern.charAt(i),word.charAt(i));
                i++; 
            }
            if(flag){
                ans.add(word);
            }
        }
        return ans;
    }
}