class Revision48 {
    public static int placeTiles(int n, int m) {
        if (n < m)
            return 1;
        if (n == m)
            return 2;
        int hor = placeTiles(n - 1, m);
        int ver = placeTiles(n - m, m);
        return hor + ver;
    }

    public static void main(String[] args) {
        System.out.println(placeTiles(4, 2));
    }
}