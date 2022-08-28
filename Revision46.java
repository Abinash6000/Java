public class Revision46 {
    public static int countPaths(int n, int m, int i, int j) {
        if (i == n || j == m)
            return 0;
        if (i == n - 1 && j == m - 1)
            return 1;
        // horizontal
        int hoz = countPaths(n, m, i, j + 1);
        // vertical
        int vec = countPaths(n, m, i + 1, j);
        return hoz + vec;
    }

    public static void main(String[] args) {
        System.out.println(countPaths(3, 3, 0, 0));
    }
}
