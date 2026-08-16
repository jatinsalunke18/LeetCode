class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++)
            rows[i] = new StringBuilder();
        int i = 0;
        int k = 0;
        int flag = 0;
        while(i<s.length()){
            rows[k].append(s.charAt(i));
            if(flag==0){
                k++;
                if(k==numRows){
                    k-=2;
                    flag = (flag+1)%2;
                }
            }
            else{
                k--;
                if(k<0){
                    k+=2;
                    flag = (flag+1)%2;
                }
            }
            i++;
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder row : rows)
            ans.append(row);
        return ans.toString();
    }
}