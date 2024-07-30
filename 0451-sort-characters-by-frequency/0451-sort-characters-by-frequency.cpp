class Solution {
public:
    static bool compare(pair<int,int> a,pair<int,int> b){
        if(a.first==b.first){
            return a.second > b.second;
        }
        return a.first > b.first;
    }
    string frequencySort(string s) {
        map<char,int> mp;
        for(int i = 0;i<s.length();i++){
            mp[s[i]]++;
        }
        vector<pair<int,char>> v;
        for(auto it : mp){
            v.push_back({it.second,it.first});
        }
        sort(v.begin(),v.end(),compare);
        string ans;
        for(auto it : v){
            int k = it.first;
            while(k-->0){
                ans+=it.second;
            }
        }
        return ans;

    }
};