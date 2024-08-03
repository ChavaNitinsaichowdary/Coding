class Solution {
public:
    static void helper(int idx,vector<vector<int>>& ans,vector<int>& sub,vector<int>& nums){
        if(idx==nums.size()){
            if(find(ans.begin(),ans.end(),sub)==ans.end()){
                ans.push_back(sub);
            }
            return;
        }
        helper(idx+1,ans,sub,nums);
        sub.push_back(nums[idx]);
        helper(idx+1,ans,sub,nums);
        sub.pop_back();
    }
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<vector<int>> ans;
        vector<int> sub;
        helper(0,ans,sub,nums);
        return ans;
    }
};