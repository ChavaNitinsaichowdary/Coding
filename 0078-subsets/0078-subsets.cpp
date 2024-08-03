class Solution {
public:
    static void helper(int index,vector<vector<int>> &ans,vector<int>& sub,vector<int>& nums){
        if(index==nums.size()){
            ans.push_back(sub);
            return;
        }
            helper(index+1,ans,sub,nums);
            sub.push_back(nums[index]);
            helper(index+1,ans,sub,nums);
            sub.pop_back();

    }
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>> ans;
        vector<int> sub;
        helper(0,ans,sub,nums);
        return ans;
    }
};