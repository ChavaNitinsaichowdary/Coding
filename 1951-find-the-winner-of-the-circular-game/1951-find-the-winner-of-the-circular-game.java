class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1;i<=n;i++){
            q.add(i);
        }
        int ans = 0;
        while(!q.isEmpty()){
            int t = k-1;
            while(t-->0){
                q.add(q.remove());
            }
            ans = q.remove();
        }
        return ans;
    }
}