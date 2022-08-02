public class revision3 {
    public static void main(String args[]) {
        int count = 0;
        int n = 1024;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.println(count);
    }
}