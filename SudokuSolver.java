public class SudokuSolver {
    public boolean isSafe(char[][] board , int row , int col , char val) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == val) {
                return false;
            }
            if (board[row][i] == val) {
                return false;
            }
        }
            int sr = 3 * (row / 3);
            int sc = 3 * (col / 3);
            for (int i = sr; i < sr + 3; i++) {
                for (int j = sc; j < sc + 3; j++) {
                    if (board[i][j] == val) {
                return false;
            }
                }
            }
            return true;
    }
    public boolean helper(char[][] board , int row , int col) {
        return solve(board, row, col);
    }
     public boolean solve(char[][] board , int row , int col) {
        if (row == board.length) {
            return true;
            
        }
        int nrows = 0;
        int ncols = 0;
        if (col != board.length - 1) {
             nrows = row;
             ncols = col + 1;
        } else {
             nrows = row + 1;
                ncols = 0;
        } 
        if (board[row][col] != '.') {
           if (helper(board, nrows, ncols)) {
            return true;
           } 
        }else{
            for (char i = '1'; i <= '9'; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = i;
                    if (helper(board, nrows, ncols)) {
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        helper(board, 0 , 0);
    }
}