public class Revision57 {
    public static int powern(int x, int n) {
        if (n == 0)
            return 1;
        if (x == 0)
            return 0;
        return powern(x, n - 1) * x;
    }

    public static void main(String[] args) {
        System.out.println(powern(2, 10));
    }
}
