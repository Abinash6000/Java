public class Revision58 {
    public static void printreverse(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printreverse(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "ABCD";
        printreverse(str, str.length() - 1);
    }
}
