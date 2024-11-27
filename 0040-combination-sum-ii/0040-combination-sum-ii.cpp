class Solution {
public:
    void helper(int index,int target,vector<int>& freq,vector<vector<int>> &ans,vector<int>& sub){
        if(target==0){
            ans.push_back(sub);
            return;
        }
        if(index>=freq.size() || target<0){
            return;
        }
        helper(index+1,target,freq,ans,sub);
        if(freq[index]>0){
            freq[index]--;
            sub.push_back(index);
            helper(index,target-index,freq,ans,sub);
            sub.pop_back();
            freq[index]++;
        }
        
    }
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        vector<int> freq(51,0);
        for(int i : candidates){
            freq[i]++;
        }
        vector<vector<int>> ans;
        vector<int> sub;
        helper(0,target,freq,ans,sub);
        return ans;
    }
};