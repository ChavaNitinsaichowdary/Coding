class Solution {
public:
    bool isIsomorphic(string s, string t) {
        map<char,char> mp;
        set<char> st;
        for(int i = 0;i<s.length();i++){
            if(mp.count(s[i])){
                if(mp[s[i]]!=t[i])return false;
            }
            else{
                if(st.count(t[i]))return false;
                mp[s[i]] = t[i];
                st.insert(t[i]);
            }
        }
        return true;
    }
};