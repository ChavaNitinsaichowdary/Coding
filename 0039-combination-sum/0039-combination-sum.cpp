class Solution {
public:
    void helper(vector<vector<int>>& ans,vector<int>& candidates,int target,vector<int>& sub,int index){
        if(target<0){
            return;
        }
        if(target==0){
            ans.push_back(sub);
            return;
        }
        for(int i = index;i<candidates.size();i++){
            sub.push_back(candidates[i]);
            helper(ans,candidates,target-candidates[i],sub,i);
            sub.pop_back();
        }
    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> ans;
        vector<int> sub;
        helper(ans,candidates,target,sub,0);
        return ans;
    }

};