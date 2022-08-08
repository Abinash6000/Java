class Solution {
    public boolean isSafe(char[][] board, int row, int col, int number) {
        // row & column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
            if (board[row][i] == (char) (number + '0')) {
                return false;
            }
        }
        // subgrid
        int sr = (row / 3) * 3; // starting row
        int sc = (col / 3) * 3; // starting column
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }
        int nrow = 0; // nrow and ncol will only be used while calling helper function next time.
        int ncol = 0;
        if (col == board.length - 1) { // if it is not last col then go to next column
            nrow = row + 1;
            ncol = 0;
        } else { // else go to next row
            nrow = row;
            ncol = col + 1;
        }

        if (board[row][col] != '.') { // if there is a number in the cell
            if (helper(board, nrow, ncol)) {// then call helper again and
                return true; // return what helper returns (in case last cell of sudoku was a number
                             // then the helper will return true when sudoku
                             // gets completed and from here it should also return true.)
            }
        } else { // else if the cell is empty then we are going to fill a number there.
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0'); // type casting i into char type.
                    if (helper(board, nrow, ncol)) { // calling helper again and returning what it returns
                        return true;
                    } else {
                        board[row][col] = '.'; // if helper returns false then the current integer is not fit for solved
                                               // sudoku.
                    }
                }
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}