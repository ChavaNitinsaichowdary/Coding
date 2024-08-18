class Solution {
public:
    int countKConstraintSubstrings(string s, int k) {
        int i  = 0,j = 0;
        int n = s.length();
        int o = 0,z = 0;
        int ans = 0;
        
        while(i<n){
            if(s[j]=='0')z++;
            else o++;
            while(j<n && (z<=k || o<=k)){
                cout <<i<<" "<<j<<endl;
                ans++;
                j++;
                if(s[j]=='0')z++;
                else o++;
            }
            z = 0,o = 0;
            i++;
            j = i;
        }
        return ans;
    }
};