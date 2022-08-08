public class Revision44 {
    public static int totalPaths(int n, int m, int i, int j) {
        if (i == n || j == m)
            return 0;
        if (i == n - 1 && j == m - 1)
            return 1;
        // rightwards
        int rightwards = totalPaths(n, m, i, j + 1);
        // downwards
        int downwards = totalPaths(n, m, i + 1, j);
        return rightwards + downwards;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        System.out.println(totalPaths(n, m, 0, 0));
    }
}
