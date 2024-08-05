class Solution {
public:
    static bool isPalin(string& s,int i,int j){
        while(i<j){
            if(s[i]==s[j]){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    static void helper(int idx,string& s,vector<string>& sub,vector<vector<string>>& ans){
        if(idx==s.length()){
           ans.push_back(sub);
            return;
        }
        for(int i = idx;i<s.length();i++){
                string str = s.substr(idx,i-idx+1);
                if(isPalin(s,idx,i)){
                    sub.push_back(str);
                    helper(i+1,s,sub,ans);
                    sub.pop_back();
                }
        }
    }
    vector<vector<string>> partition(string s) {
        vector<vector<string>> ans;
        vector<string> sub;
        helper(0,s,sub,ans);
        return ans;
    }
};