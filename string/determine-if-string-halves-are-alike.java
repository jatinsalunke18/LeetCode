class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int i = 0;
        int ans = 0;
        int j = n/2;
        while(i<n/2){
            char c = s.charAt(i);
            char d = s.charAt(j);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                ans++;
            }
            if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u'||d=='A'||d=='E'||d=='I'||d=='O'||d=='U'){
                ans--;
            }
            i++;
            j++;
        }
        return ans == 0;
    }
}