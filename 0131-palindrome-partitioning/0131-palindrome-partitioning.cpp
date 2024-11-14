class Solution {
public:
    bool isPalindrome(string s,int i,int j){
        while(i<j){
            if(s[i]==s[j]){
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
    void helper(int idx,vector<vector<string>>& ans,vector<string> v,string s){
        if(idx==s.size()){
            ans.push_back(v);
            return;
        }
        for(int i = idx;i<s.size();i++){
            if(isPalindrome(s,idx,i)){
                v.push_back(s.substr(idx,i-idx+1));
                helper(i+1,ans,v,s);
                v.pop_back();
            }
        }
    }
    vector<vector<string>> partition(string s) {
        vector<vector<string>> ans;
        vector<string> v;
        helper(0,ans,v,s);
        return ans;
    }
};