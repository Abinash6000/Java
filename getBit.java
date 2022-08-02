
public class getBit {
    public static void main(String args[]) {
        int n = 5;
        int pos = 0;
        int bitMask = 1 << pos;
        if ((n & bitMask) == 0) {
            System.out.println("The bit is zero");
        } else {
            System.out.println("The bit is one");
        }
    }
}
