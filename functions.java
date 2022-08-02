
public class functions {
    public static int multiply(int a, int b) {
        return (a * b);
    }

    public static void factorial(int n) {
        int j = 1;
        for (int i = n; i > 0; i--) {
            j = j * i;
        }
        System.out.println(j);
    }

    public static void main(String args[]) {
        System.out.println(multiply(5, 7));
        System.out.println();
        factorial(5);
    }
}
