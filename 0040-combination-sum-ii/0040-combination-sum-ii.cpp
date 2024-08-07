class Solution {
public:
    vector<vector<int>> ans;
    vector<int> sub;
    void backtrack(int idx,vector<int>& freq,vector<int>& candidates,int target){
        if(target==0){
            ans.push_back(sub);
            return;
        }
        if(idx==freq.size() || target<0){
            return;
        }
        backtrack(idx+1,freq,candidates,target);
        if(freq[idx]){
            freq[idx]--;
            sub.push_back(idx);
            backtrack(idx,freq,candidates,target-idx);
            sub.pop_back();
            freq[idx]++;
        }
    }
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        vector<int> freq(51);
        for(auto &i : candidates){
            freq[i]++;
        }
        backtrack(1,freq,candidates,target);
        return ans;

    }
};