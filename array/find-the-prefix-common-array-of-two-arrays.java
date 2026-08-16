class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> set = new HashSet<>();
        int len = A.length;
        int result[] = new int[len];
        int count = 0;
        for(int i=0;i<len;i++){
            set.add(A[i]);
            for(int j=0;j<=i;j++){
                if(set.contains(B[j])) count++;
            }
            result[i] = count;
            count = 0;
        }
        return result;
    }
}