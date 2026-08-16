class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> ans = new ArrayList<>();
        long cur = 2;
        long sum = finalSum;
        int index = -1;
        if(finalSum % 2!=0) return ans;
        while(sum-cur>=0){
            sum -= cur;
            ans.add(cur);
            cur+=2;
            index++;
        }
        ans.add(ans.get(index)+sum);
        ans.remove(index);
        return ans;
    }

}