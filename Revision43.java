import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Revision43 {
    public static boolean isSafe(char[][] board, int row, int col) {
        // horizontal
        for (int c = 0; c < col; c++) {
            if (board[row][c] == 'Q')
                return false;
        }
        // upperleft
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q')
                return false;
        }
        // upperright
        for (int r = row, c = col; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c] == 'Q')
                return false;
        }
        // lowerleft
        for (int r = row, c = col; r < board.length && c >= 0; r++, c--) {
            if (board[r][c] == 'Q')
                return false;
        }
        // lowerright
        for (int r = row, c = col; r < board.length && c < board.length; r++, c++) {
            if (board[r][c] == 'Q')
                return false;
        }
        return true;
    }

    public static void saveBoard(List<List<String>> allBoards, char[][] board) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = "";
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public static void helper(List<List<String>> allBoards, char[][] board, int col) {
        if (col == board.length) {
            saveBoard(allBoards, board);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                helper(allBoards, board, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] board = new char[n][n];
        List<List<String>> allBoards = new ArrayList<>();
        helper(allBoards, board, 0);
        // print
        System.out.println(allBoards);
    }
}
