class Solution {
public:
    
    void helper(int i,int j,string& o,string& c,string t,vector<string>& ans){
        if(j>i)return;
        if(i==o.size() && j == c.size()){
            ans.push_back(t);
            return;
        }
        if(i==o.size()){
            helper(i,j+1,o,c,t+')',ans);
            return;
        }
        helper(i+1,j,o,c,t+'(',ans);
        helper(i,j+1,o,c,t+')',ans);
    }
    vector<string> generateParenthesis(int n) {
        vector<string> ans;
        string o,c,t;
        for(int i = 0;i<n;i++){
            o.push_back('(');
            c.push_back(')');
        }
        helper(0,0,o,c,t,ans);
        return ans;
        
    }
};