class Solution {
    public int findCenter(int[][] edges) {
        List<List<Integer>> ls = new ArrayList<>();
        int n = edges.length+1;
        for(int i = 0;i<=n;i++){
            ls.add(new ArrayList<Integer>());
        }
        for(int[] edge : edges){
            ls.get(edge[0]).add(edge[1]);
            ls.get(edge[1]).add(edge[0]);
        }
        for(int i = 1;i<=n;i++){
            if(ls.get(i).size()==n-1){
                return i;
            }
        }
        return 0;
    }
}