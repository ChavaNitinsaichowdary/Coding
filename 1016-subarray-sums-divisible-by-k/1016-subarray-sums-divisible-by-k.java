class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int sum = 0,count = 0;
        mp.put(0,1);
        for(int i = 0;i<nums.length;i++){
            sum  = ((sum + nums[i])%k+k)%k;
            count+=mp.getOrDefault(sum,0);
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return count;
    }
}