public class revision6 {
    public static void main(String args[]) {
        int n = 6;
        int m = n & (n - 1);
        if (n != 0 && m == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
