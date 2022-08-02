public class revision9 {
    public static void main(String args[]) {
        int n = 24239;
        int notn = ~n;
        int twoxm1 = n | notn; // 2x-1 = n|notn
        System.out.println(twoxm1);
        System.out.println((twoxm1 + 1) >> 1);
    }
}
