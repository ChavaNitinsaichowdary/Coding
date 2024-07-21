class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        while(j<nums.length){
            while(j<nums.length && nums[i]==nums[j]){
                j++;
            }
            if(j<nums.length)i++;
            if(i<nums.length && j<nums.length){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
           // System.out.println(Arrays.toString(nums)+" "+i+" "+j);
        }
        return i+1;
    }
}