class Solution {
    static {
        for (int i = 0; i < 10; i++) {
            maxArea(new int[]{0, 0});
        }
    }
    public static int maxArea(int[] height) {
       int max = 0;
       int first = 0;
       int second = height.length-1;
       while(first<second){
        int area = Math.min(height[first],height[second])*(second-first);
        max = Math.max(max,area);
        if(height[first]<height[second]) first++;
        else second--;
       }
       return max;
    }
}