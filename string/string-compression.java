class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1) return 1;
        String  str = "";
        int i = 0;
        int j = 1;
        int k = 0;
        int count = 1;
        while(j<chars.length){
            if(chars[i]==chars[j]){
                count++;
                j++;
            }
            else{
                chars[k++] = chars[i];
                if(count>1){
                    char cntarr[] = String.valueOf(count).toCharArray();
                    for(char dig:cntarr){
                        chars[k++] = dig;
                    } 
                }
                count = 1;
                i=j;
                j++;
            }
        }
        chars[k++] = chars[i];
        if(count>1){
            char cntarr[] = String.valueOf(count).toCharArray();
            for(char dig:cntarr){
                chars[k++] = dig;
            } 
        }
        return k;
    }
}