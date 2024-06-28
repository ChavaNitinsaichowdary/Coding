class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long[] degree = new long[n];
        for(int[] edge : roads){
            degree[edge[0]]++;
            degree[edge[1]]++;
        }
        Arrays.sort(degree);
        long ans = 0;
        long curr = 1;
        for(long d : degree){
            ans+=(curr*d);
            curr++;
        }
        return ans;
    }
}