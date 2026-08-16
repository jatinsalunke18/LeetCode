class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean isPrime[] = new boolean[right+1];
        isPrime[0] = true;
        isPrime[1] = true;
        for(int i=2;i<=right;i++){
            if(!isPrime[i]){
                for(int j=2;j*i<=right;j++){
                    isPrime[i*j] = true;
                }
            }
        }
        int min  = Integer.MAX_VALUE;
        int ans1 = -1;
        int ans2 = -1;
        int num1 = -1;
        int num2 = -1;
        for(int i=left;i<=right;i++){
            if (!isPrime[i]) {
                if (num2 != -1) {
                    num1 = num2;
                    num2 = i;

                    if (num2 - num1 < min) {
                        min = num2 - num1;
                        ans1 = num1;
                        ans2 = num2;
                    }
                } else {
                    num2 = i;
                }
            }
        }
        return new int[]{ans1,ans2};
    }
}