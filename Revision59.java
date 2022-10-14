public class Revision59 {
    public static void main(String[] args) {
        // count the number of ones in the binay representation of the given number.
        int n = 235; // 0101
        int c = 0;
        while (n != 0) {
            n = (n - 1) & n;
            c++;
        }
        System.out.println(c);
    }
}
