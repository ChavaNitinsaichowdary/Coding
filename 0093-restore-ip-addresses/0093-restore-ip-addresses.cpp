class Solution {
public:
    vector<string> ans;
    void helper(int idx,string t,string& s,int cnt){
        if(cnt==-1 && idx==s.length()){
            ans.push_back(t.substr(0,t.length()-1));
        }
        if(idx>=s.length())return;

        int num = 0;
        for(int i = idx;i<s.length();i++){
            num = stoi(s.substr(idx,i-idx+1));
            if(num>=0 && num<=255){
                if(i==idx+1 && s[i-1]=='0')break;
                helper(i+1,t+to_string(num)+'.',s,cnt-1);
            }
            else{
                break;
            }

        }
    }
    vector<string> restoreIpAddresses(string s) {
        helper(0,"",s,3);
        return ans;
    }
};