public class Revision64 {
    public static void main(String[] args) {
        int n = 5;
        int bitmask = 1 << 2;
        System.out.println(n & (~bitmask));
    }
}
