class Solution {
public:
    vector<int> sub;vector<vector<int>> ans;
    void helper(int idx,vector<int>& candidates,int target){
        if(target==0){
            ans.push_back(sub);
            return;
        }
        if(idx==candidates.size() || target<0){
            return;
        }
            helper(idx+1,candidates,target);
            sub.push_back(candidates[idx]);
            helper(idx,candidates,target-candidates[idx]);
            sub.pop_back();
       
    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        helper(0,candidates,target);
        return ans;

    }
};