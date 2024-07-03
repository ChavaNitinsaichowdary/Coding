class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(nums.length<=4)return 0;
        return Math.min(nums[n-1]-nums[3],Math.min(nums[n-4]-nums[0],Math.min(nums[n-2]-nums[2],nums[n-3]-nums[1])));
    }
}