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
            string cnt;
            for(int i = 0;i<sub.size();i++){
                cnt+=sub[i];
            }
            if(cnt==s)ans.push_back(sub);
            return;
        }
        for(int i = idx;i<s.length();i++){
            for(int j = i;j<s.length();j++){
                string str = s.substr(i,j-i+1);
                if(isPalin(s,i,j)){
                    sub.push_back(str);
                    helper(j+1,s,sub,ans);
                    sub.pop_back();
                }
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