class Solution {
public:
    bool isSafe(char ch,int i,int j,vector<vector<char>>& board){
        for(int r = 0;r<9;r++){
            if(board[r][j]==ch){
                return false;
            }
        }
        for(int c =0;c<9;c++){
            if(board[i][c]==ch){
                return false;
            }
        }
        int r = 3*(i/3);
        int c = 3*(j/3);
        for(int i = r;i<=r+2;i++){
            for(int j = c;j<=c+2;j++){
                if(board[i][j]==ch){
                    return false;
                }
            }
        }
        return true;
    }
   bool helper(int i,int j,vector<vector<char>>& board){
        if(i==9)return true;
        if(j==9){
            return helper(i+1,0,board);
        }
        if(board[i][j]=='.'){
            for(char k = '1';k<='9';k++){
                if(isSafe(k,i,j,board)){
                    board[i][j] = k;
                    if(helper(i,j+1,board)){
                        return true;
                    }
                    board[i][j] = '.';
                }
            }
        }
        else{
           return helper(i,j+1,board);
        }
        return false;
    }
    void solveSudoku(vector<vector<char>>& board) {
        helper(0,0,board);
        return;
    }
};