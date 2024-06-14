class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int curr = 0;
        for(int i = 0;i<nums.length;i++){
            curr = Math.max(curr,nums[i]);
            ans+=(curr - nums[i]);
            curr++;
        }
        return ans;

    }
}