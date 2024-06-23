class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int i = 0,j = 0;
        int ans = 0;
        Deque<Integer> qmax = new ArrayDeque<>();
        Deque<Integer> qmin = new ArrayDeque<>();

        while(j<nums.length){
            while(!qmax.isEmpty() && qmax.peekLast()<nums[j]){
                qmax.removeLast();
            }
            qmax.addLast(nums[j]);
             while(!qmin.isEmpty() && qmin.peekLast()>nums[j]){
                qmin.removeLast();
            }
            qmin.addLast(nums[j]);
            while(qmax.peekFirst()-qmin.peekFirst()>limit){
                if(qmax.peekFirst()==nums[i])qmax.pollFirst();
                if(qmin.peekFirst()==nums[i])qmin.pollFirst();
                i++;
            }
            
            ans = Math.max(j-i+1,ans);
            j++;
            
        }
        return ans;
    }
}