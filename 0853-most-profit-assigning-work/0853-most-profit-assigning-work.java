class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        List<int[]> ls = new ArrayList<>();
        for(int i = 0;i<difficulty.length;i++){
            ls.add(new int[]{difficulty[i],profit[i]});
        }
        Collections.sort(ls,(a,b)->a[0]-b[0]);
        Arrays.sort(worker);
        int ans = 0;
        int max = 0;
        int j = 0;
        for(int i = 0;i<worker.length;i++){
            while(j<ls.size() && ls.get(j)[0]<=worker[i]){
                max = Math.max(max,ls.get(j)[1]);
                j++;
            }
            ans+=max;
        }
        return ans;
    }
}