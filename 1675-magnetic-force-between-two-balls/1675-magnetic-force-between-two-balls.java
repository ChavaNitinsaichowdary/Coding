class Solution {
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        long max = position[n-1]-position[0];
        long min = position[n-1];
        for(int i = 1;i<position.length;i++){
            min = Math.min(min,position[i]-position[i-1]);
        }
        long ans = 0;
        while(min<=max){
            long force = min + (max-min)/2;
            if(checker(force,position,m)){
                ans = force;
                min = force+1;
            }else{
                max = force-1;
            }
        }
        return (int)ans;
    }
    public boolean checker(long force,int[] position,int m){
        int last = position[0];
        int cnt = 1;
        for(int i = 1;i<position.length;i++){
            if(position[i]-last>=force){
                last = position[i];
                cnt++;
            }
            if(cnt>=m)return true;
        }
        return false;
    }
}