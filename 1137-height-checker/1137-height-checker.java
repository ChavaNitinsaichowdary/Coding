class Solution {
    public int heightChecker(int[] heights) {
        int[] freq = new int[101];
        for(int num : heights){
            freq[num]++;
        }
        int ans = 0;
        int j = 0;
        for(int i = 1;i<=100;i++){
            while(freq[i]>0){
                if(heights[j]!=i){
                    ans++;
                }
                freq[i]--;
                j++;
            }
        }
        return ans;
        
    }
}