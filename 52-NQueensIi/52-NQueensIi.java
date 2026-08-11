// Last updated: 11/08/2026, 16:16:08
class Solution {
    int count = 0;
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] row : board)
            Arrays.fill(row, '.');
        solve(0, board);
        return count;
    }
    void solve(int row, char[][] board) {
        if (row == board.length) {
            count++;
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                solve(row + 1, board);
                board[row][col] = '.';
            }
        }
    }
    boolean isSafe(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++)
            if (board[i][j] == 'Q') return false;
        return true;
    }
}