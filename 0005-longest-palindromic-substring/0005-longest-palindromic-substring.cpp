class Solution {
public:
    static bool isPalindrome(string &s,int i,int j){
        while(i<=j){
            if(s[i]!=s[j])return false;
            i++;
            j--;
        }
        return true;
    }
    string longestPalindrome(string s) {
        string ans = s.substr(0,1);
        int mx = 1;
        for(int i = 0;i<s.length();i++){
            for(int j = i+1;j<s.length();j++){
                if(isPalindrome(s,i,j)){
                    if(j-i+1 > ans.length()){
                        ans = s.substr(i,j-i+1);
                        mx = max(mx,j-i+1);
                    }
                }
            }
        }
        return ans;
    }

};