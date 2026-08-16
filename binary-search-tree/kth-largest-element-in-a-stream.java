class KthLargest {
    private PriorityQueue<Integer> minheap;
    private int k = 0;
    public KthLargest(int k, int[] nums) {
        minheap = new PriorityQueue<>();
        this.k = k;
        for(int num:nums){
            add(num);
        }
    }
    
    public int add(int val) {
        minheap.offer(val);
        if(minheap.size()>k) minheap.poll();
        return minheap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */