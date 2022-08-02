import java.util.*;

public class twoDArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int rowStart = 0;
        int rowEnd = rows - 1;
        int colStart = 0;
        int colEnd = cols - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(arr[rowStart][col] + " ");
            }
            rowStart++;
            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(arr[row][colEnd] + " ");
            }
            colEnd--;
            for (int col = colEnd; col >= colStart; col--) {
                System.out.print(arr[rowEnd][col] + " ");
            }
            rowEnd--;
            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(arr[row][colStart] + " ");
            }
            colStart++;
        }
        sc.close();
    }
}