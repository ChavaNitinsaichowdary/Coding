class Solution {
    public int maximumLength(int[] nums) {
        int[] same = new int[2];
        int[] diff = new int[2];
        for(int i = 0;i<nums.length;i++){
            int curr = nums[i]%2;
            same[curr]++;
            diff[curr] = 1 + diff[curr^1];
        }
        return Math.max(same[0],Math.max(same[1],Math.max(diff[0],diff[1])));

    }
}