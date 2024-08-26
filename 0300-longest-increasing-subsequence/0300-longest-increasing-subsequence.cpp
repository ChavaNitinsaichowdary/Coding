class Solution {
public:
    int helper(vector<int> &nums,int index,int prev,vector<vector<int>>& dp){
        if(index>=nums.size())return 0;
        if(dp[index][prev+1]!=-1)return dp[index][prev+1];
        if(prev==-1){
            return dp[index][prev+1]= max(1+helper(nums,index+1,index,dp),helper(nums,index+1,prev,dp));
        }
        if(nums[index]>nums[prev]){
            return dp[index][prev+1] = max(1+helper(nums,index+1,index,dp),helper(nums,index+1,prev,dp));
        }
        else{
            return dp[index][prev+1] = helper(nums,index+1,prev,dp);
        }
    }
    int lengthOfLIS(vector<int>& nums) {
        int n = nums.size();
       vector<vector<int>> dp(n, vector<int>(n + 1, -1));
        return helper(nums,0,-1,dp);
    }
};