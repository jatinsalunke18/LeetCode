class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder str = new StringBuilder("");
        int first = num1.length()-1;
        int second = num2.length()-1;
        int carry = 0;
        while(first>=0 && second>=0){
            int n1 = num1.charAt(first)-'0'; 
            int n2 = num2.charAt(second)-'0';
            first--;
            second--;
            str.append(((n1+n2+carry)%10)+"");
            carry = (n1+n2+carry)/10;
        }
        while(first>=0){
            int n1 = num1.charAt(first)-'0'; 
            first--;
            str.append((n1+carry)%10+"");
            carry = (n1+carry)/10;
        }
        while(second>=0){
            int n1 = num2.charAt(second)-'0'; 
            second--;
            str.append((n1+carry)%10+"");
            carry = (n1+carry)/10;
        }
        if(carry>0) str.append(carry);
        return str.reverse().toString();
    }
}