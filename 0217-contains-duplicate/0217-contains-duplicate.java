class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int num : nums){
            s.add(num);
        }
        if(s.size()!=nums.length)return true;
        return false;
    }
}