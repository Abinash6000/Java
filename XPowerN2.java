public class XPowerN2 {
    public static int calcPow(int x, int n) {
        if (n == 1)
            return x;
        if (n == 0)
            return 1;
        if (n % 2 == 0)
            return calcPow(x, n / 2) * calcPow(x, n / 2);
        else
            return x * calcPow(x, n / 2) * calcPow(x, n / 2);
    }

    public static void main(String[] args) {
        System.out.println(calcPow(2, 9));
    }
}
