class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long curmas = mass;
        for(int i=0;i<asteroids.length;i++){
            if(curmas<asteroids[i]) return false;
            else{
                curmas+= asteroids[i];
            }
        }
        return true;
    }
}