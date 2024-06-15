class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] pro = new int[n][2];
        for(int i = 0;i<n;i++){
            pro[i][0] = capital[i];
            pro[i][1] = profits[i];
        }
        Arrays.sort(pro,(a,b)->Integer.compare(a[0],b[0]));
        int i = 0;
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        while(k-->0){
            while(i<n && pro[i][0]<=w){
                max.offer(pro[i][1]);
                i++;
            }
            if(max.isEmpty()){
                break;
            }
            w+=max.poll();
        }
        return w;
    }
}