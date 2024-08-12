class Solution {
public:
    bool helper(int i,int j,int idx,vector<vector<char>>& board,string& word){
        if(idx==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.size() || j>=board[0].size())return false;
        
        bool ans = false;
        if(board[i][j]==word[idx]){
            char temp = board[i][j];
            board[i][j] = '#';
           ans = ans || helper(i+1,j,idx+1,board,word);
           ans = ans || helper(i,j+1,idx+1,board,word);
           ans = ans || helper(i-1,j,idx+1,board,word);
           ans = ans || helper(i,j-1,idx+1,board,word);
           board[i][j] = temp;
        }
        return ans;

    }
    bool exist(vector<vector<char>>& board, string word) {
        for(int i = 0;i<board.size();i++){
            for(int j = 0;j<board[0].size();j++){
                if(helper(i,j,0,board,word))return true;
            }
        }
        return false;
    }
};