public class revision18 {
    public static void printFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        printFib(b, c, n - 1);
    }

    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        int n = 100;
        System.out.print(a + " ");
        System.out.print(b + " ");
        printFib(a, b, n - 2);
    }
}
