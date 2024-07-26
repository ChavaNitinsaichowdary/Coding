class Solution {
    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        int[][] neighborCount = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 1) {
                    if (i > 0) neighborCount[i-1][j]++;
                    if (j > 0) neighborCount[i][j-1]++;
                    if (i > 0 && j > 0) neighborCount[i-1][j-1]++;
                    if (i < rows - 1) neighborCount[i+1][j]++;
                    if (j < cols - 1) neighborCount[i][j+1]++;
                    if (i < rows - 1 && j < cols - 1) neighborCount[i+1][j+1]++;
                    if (i > 0 && j < cols - 1) neighborCount[i-1][j+1]++;
                    if (i < rows - 1 && j > 0) neighborCount[i+1][j-1]++;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 1) {
                    if (neighborCount[i][j] < 2 || neighborCount[i][j] > 3) {
                        board[i][j] = 0;
                    }
                } else {
                    if (neighborCount[i][j] == 3) {
                        board[i][j] = 1;
                    }
                }
            }
        }
    }
}
