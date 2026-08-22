class Solution {
    public int numberOfGoodPartitions(int[] nums) {
        if(nums.length==1) return 1;
        int rep = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>1) rep++;
        }
        if(map.size()==nums.length) return map.size()*2;
        if(map.size()==rep) return map.size();
        return map.size()-rep;
    }
}