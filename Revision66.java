public class Revision66 {
    public static void printFib(int n, int a, int b) {
        if (n == 3) {
            System.out.println(a + b);
            return;
        }
        System.out.println(a + b);
        printFib(n - 1, b, a + b);
    }

    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        printFib(10, 0, 1);
    }
}
