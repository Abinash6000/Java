public class revision7 {
    public static void main(String args[]) {
        int n = 5;
        int bitMask = 1 << 2;
        int notBitMask = ~bitMask;
        System.out.println(n & notBitMask);
    }
}
