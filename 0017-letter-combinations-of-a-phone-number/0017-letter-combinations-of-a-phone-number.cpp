class Solution {
public:
    map<int,string> mp = {{2,"abc"},{3,"def"},{4,"ghi"},{5,"jkl"},{6,"mno"},{7,"pqrs"},{8,"tuv"},{9,"wxyz"}};
    void helper(int idx,string& t,string& digits,vector<string>& ans){
        if(idx==digits.size()){
            ans.push_back(t);
            return;
        }

        string curr = mp[digits[idx]-'0'];
        for(int i = 0;i<curr.size();i++){
            t.push_back(curr[i]);
            helper(idx+1,t,digits,ans);
            t.pop_back();
        }
    }
    vector<string> letterCombinations(string digits) {
        vector<string> ans;
        if(digits.empty())return ans;
        string t;
        helper(0,t,digits,ans);
        return ans;

    }
};