public class XPowerN1 {
    public static int calcPower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int powernm1 = calcPower(x, n - 1);
        int powern = x * powernm1;
        return powern;
    }

    public static void main(String args[]) {
        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
