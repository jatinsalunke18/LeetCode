class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int min  = (int)Math.log10(low)+1;
        int max  = (int)Math.log10(high)+1;
        List<Integer> list = new ArrayList<>();
        int arr[] = {1,2,3,4,5,6,7,8,9};
        Boolean flag = true;
        int len = min;
        while(len <= max){
            int k = 0;
            while(k<=arr.length-len){
                int temp = 0;
                for(int j=k;j<len+k;j++){
                    temp = temp*10+arr[j];
                }
                if(temp>high){
                    flag = false;
                }
                else{
                    if(temp>=low) list.add(temp);
                }
                k++;
            }
            if(!flag) break;
            len++;
        }
        return list;
    }
}