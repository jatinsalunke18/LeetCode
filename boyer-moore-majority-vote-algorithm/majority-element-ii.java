class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int maj1 = 0;
        int vote1 = 0;

        int maj2 = 0;
        int vote2 = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == maj1){
                vote1++;
            }else if(nums[i] == maj2){
                vote2++;
            }else if(vote1 == 0){
                maj1 = nums[i];
                vote1=1;
            }else if(vote2 == 0){
                maj2 = nums[i];
                vote2=1;
            }else{
                vote1--;
                vote2--;
            }
        }
        //Verification
        int freq1 = 0;
        int freq2 = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == maj1){
                freq1++;
            }else if(nums[i] == maj2){
                freq2++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();

        if(freq1 > nums.length/3){
            ans.add(maj1);
        }if(freq2 > nums.length/3){
            ans.add(maj2);
        }

        return ans;
    }
}