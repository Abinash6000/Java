
public class revision26 {
    public static int calcPow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        // for even
        if (n % 2 == 0) {
            return calcPow(x, n / 2) * calcPow(x, n / 2);
        } else {
            // for odd
            return calcPow(x, n / 2) * calcPow(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(calcPow(2, 5));
    }
}
