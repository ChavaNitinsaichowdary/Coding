class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        System.out.println(n);
        if(m*k>n) return -1;
        int lo = 1;
        int hi = (int)1e9;
        int ans = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(checker(bloomDay,m,k,mid)){
                ans = mid;
                hi = mid-1;
            }
            else{
                
                lo = mid + 1;
            }
        }

        return ans;

    }
    public static boolean checker(int[] bloomDay, int m, int k, int mid) {
    int count = 0;
    int flowersCollected = 0;

    for (int i = 0; i < bloomDay.length; i++) {
        if (bloomDay[i] <= mid) {
            flowersCollected++;
            if (flowersCollected == k) {
                count++;
                flowersCollected = 0; 
            }
        } else {
            flowersCollected = 0;  
        }
    }

    return count >= m;
}


}