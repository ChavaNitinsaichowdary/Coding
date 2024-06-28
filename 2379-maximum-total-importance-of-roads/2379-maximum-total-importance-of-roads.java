class Solution {
    public long maximumImportance(int n, int[][] edges) {
        List<List<Integer>> ls = new ArrayList<>();
        for(int i=0;i<n;i++){
            ls.add(new ArrayList<>());
            ls.get(i).add(i);
        }
        for(int[] edge : edges){
            ls.get(edge[0]).add(edge[1]);
            ls.get(edge[1]).add(edge[0]);
        }
        Collections.sort(ls,(a,b)->b.size()-a.size());
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<n;i++){
            mp.put(ls.get(i).get(0),n-i);
        }
        long ans = 0;
        for(int[] edge : edges){
            ans+=mp.get(edge[0]);
            ans+=mp.get(edge[1]);
        }
        return ans;
    }
}