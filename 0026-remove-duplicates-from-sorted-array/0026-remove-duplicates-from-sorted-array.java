class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;  // Pointer for the place to insert the next unique element
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {  // Found a new unique element
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
