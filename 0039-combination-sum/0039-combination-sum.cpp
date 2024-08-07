class Solution {
public:
    static void helper(int idx,int sum,vector<int>& sub,vector<vector<int>>& ans,vector<int>& candidates,int target){
        if(idx==candidates.size()){
            return;
        }
        if(sum==target){
            ans.push_back(sub);
            return;
        }
        if(sum<target){
            helper(idx+1,sum,sub,ans,candidates,target);
            sub.push_back(candidates[idx]);
            helper(idx,sum+candidates[idx],sub,ans,candidates,target);
            sub.pop_back();
        }
    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> ans;
        vector<int> sub;
        helper(0,0,sub,ans,candidates,target);
        return ans;
    }
};