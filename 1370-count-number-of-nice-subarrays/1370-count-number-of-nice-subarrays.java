class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans = 0;
        int i = 0;
        int j = 0;
        int odd = 0;
        while(j<nums.length){
            while(j<nums.length && odd<k){
                if((nums[j]&1)==1){
                    odd++;
                    System.out.println(nums[j]+"bye");
                }
                j++;
            }
            int prefixcount = 0;
            if(odd==k){
                while(j<nums.length && (nums[j]&1)==0){
                    j++;
                    prefixcount++;
                }
                ans+=(prefixcount+1);
                while (i < j && (nums[i] & 1) == 0) {
                    i++;
                    ans += (prefixcount + 1);
                }
                if (i < j) {
                    i++;
                    odd--;
                }
            }
           
        }
        return ans;
    }
}