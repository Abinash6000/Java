public class revision19 {
    public static void main(String args[]) {
        int n = 5;
        int c = 0;
        while (true) {
            if ((n & (n-1))>0) {
                c++;
                n = n&(n-1);
            } else {
                c++;
                break;
            }
        }
        System.out.println(c);
    }
}
