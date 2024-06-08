class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int sum = 0,i=0;
        while(i<nums.length){
            sum+=nums[i];
            int rem = sum%k;
            if(mp.containsKey(rem)){
                if(i-mp.get(rem)>1){
                    return true;
                }
            }
            else{
                mp.put(rem,i);
            }
            i++;
        }
        return false;
    }
}