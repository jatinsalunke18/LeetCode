class Solution {
    public int maxDistance(String moves) {
        int[] position = new int[2];
        int count = 0;
        for(int i=0;i<moves.length();i++){
            char ch = moves.charAt(i);
            if(ch=='L') position[0] = position[0]-1;
            if(ch=='R') position[0] = position[0]+1;
            if(ch=='U') position[1] = position[1]+1;
            if(ch=='D') position[1] = position[1]-1;
            if(ch=='_') count++;
        }
        int total = (int)Math.abs(position[0])+(int)Math.abs(position[1]);
        return total+count;
    }
}