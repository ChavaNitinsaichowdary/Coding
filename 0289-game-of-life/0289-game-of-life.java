class Solution {
    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        int[] x = {0,1,1,-1,0,-1,1,-1};
        int[] y = {1,0,1,-1,-1,0,-1,1};
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                    int live = 0;
                    for(int k = 0;k<8;k++){
                        int cx = i + x[k];
                        int cy = j + y[k];
                        if(cx>=0 && cy>=0 && cx<board.length && cy<board[0].length){
                            if((board[cx][cy]&1) == 1) live++;
                        }
                    }
                    if((board[i][j]&1)==1){
                        if(live<2 || live>3){
                            board[i][j] = board[i][j]&1;
                        }
                        else{
                            board[i][j] = board[i][j]|2;
                        }
                    }
                    else{
                        if(live==3){
                            board[i][j] = board[i][j]|2;
                        }
                    }
                     
                }
            }
        
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                board[i][j] = board[i][j]>>1;
            }
        }

        
    }
}
