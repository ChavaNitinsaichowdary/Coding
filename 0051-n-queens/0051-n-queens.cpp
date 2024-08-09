class Solution {
public:
    vector<vector<string>> ans;
    bool isSafe(vector<string> &v,int r,int c,int n){
        for(int i = 0;i<r;i++){
            if(v[i][c]=='Q'){
                return false;
            }
        }
        int i = r-1,j = c-1;
        while(i>=0 && j>=0){
            if(v[i][j]=='Q'){
                return false;
            }
            i--;
            j--;
        }
        i = r-1;j = c+1;
        while(i>=0 && j<n){
            if(v[i][j]=='Q'){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
    void helper(vector<string> &v,int r,int n){
        if(r==n){
            ans.push_back(v);
            return;
        }
        for(int i = 0;i<n;i++){
            if(isSafe(v,r,i,n)){
                v[r][i] = 'Q';
                helper(v,r+1,n);
                v[r][i] = '.';
            }
        }
    }
    vector<vector<string>> solveNQueens(int n) {
        vector<string> v(n);
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                v[j].push_back('.');
            }
        }
        helper(v,0,n);
        return ans;
    }
};