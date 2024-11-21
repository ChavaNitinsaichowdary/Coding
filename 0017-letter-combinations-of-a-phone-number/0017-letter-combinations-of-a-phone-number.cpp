class Solution {
public:
    void helper(map<char,string> &mp,string &digits,int index,vector<string>& ans,string &sub){
        if(index==digits.size()){
            ans.push_back(sub);
            return;
        }
        char ch = digits[index];
        string letters = mp[ch];
        for(char c : letters){
            sub+=c;
            helper(mp,digits,index+1,ans,sub);
            sub.pop_back();
        }
    }
    vector<string> letterCombinations(string digits) {
        map<char,string> mp;
        mp['2'] = "abc";mp['3'] = "def";mp['4'] = "ghi";
        mp['5'] = "jkl";mp['6'] = "mno";mp['7'] = "pqrs";
        mp['8'] = "tuv";mp['9'] = "wxyz";
        vector<string> ans;
        if(digits.size()==0){
            return ans;
        }
        string sub;
        helper(mp,digits,0,ans,sub);
        return ans;
    }
};