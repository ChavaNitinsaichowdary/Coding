class Solution {
public:
    static string helper(int n){
        if(n==1){
            return "0";
        }
        string ans;
        string last = helper(n-1);
        ans+=last;
        ans+="1";
        string ri;
        for(int i = 0;i<last.length();i++){
            if(last[i]=='0'){
                ri+='1';
            }
            else{
                ri+='0';
            }
        }
        reverse(ri.begin(),ri.end());
        ans+=ri;
        return ans;
    }
    char findKthBit(int n, int k) {
        string ans = helper(n);
        //cout << ans<<endl;
        return ans[k-1];
    }
};