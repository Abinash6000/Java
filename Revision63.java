public class Revision63 {
    public static int placeTiles(int n, int m) {
        if (n < m)
            return 1;
        if (n == m)
            return 2;
        // vertically
        int vert = placeTiles(n - m, m);
        // horizontally
        int horz = placeTiles(n - 1, m);
        return vert + horz;
    }

    public static void main(String[] args) {
        System.out.println(placeTiles(4, 2));
    }
}
