class Solution {
public:
    vector<vector<int>> ans;
    vector<int> sub;
    void helper(int idx,vector<int>& freq,int target){
        if(target==0){
            ans.push_back(sub);
            return;
        }
        if(target<0 || idx>50)return;
        helper(idx+1,freq,target);
        if(freq[idx]){
            freq[idx]--;
            sub.push_back(idx);
            helper(idx,freq,target-idx);
            sub.pop_back();
            freq[idx]++;
        }
        
    }
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        vector<int> freq(51);
        for(int &i : candidates){
            freq[i]++;
        }
        helper(1,freq,target);
        return ans;
        
    }
};