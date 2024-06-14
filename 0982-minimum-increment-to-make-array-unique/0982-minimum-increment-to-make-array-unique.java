class Solution {
    public int minIncrementForUnique(int[] nums) {
        int max = 0;
        int n = nums.length;
        for(int num : nums){
            max = Math.max(max,num);
        }
       int[] freq = new int[n+max];
       for(int num : nums){
        freq[num]++;
       }
       int ans = 0;
       for(int i = 0;i<freq.length;i++){
            if(freq[i]<=1)continue;
            int mov = freq[i]-1;
            freq[i+1] += mov;
            freq[i] = 1;
            ans+=mov;

       }
       return ans;
    }
}