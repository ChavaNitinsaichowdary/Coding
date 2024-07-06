class Solution {
    public int passThePillow(int n, int time) {
        int idx = time % (n-1);
        int dir = time/(n-1);
        if(dir%2==0){
            return idx + 1;
        }
        return n - idx;
        
    }
}