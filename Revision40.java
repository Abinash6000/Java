public class Revision40 {

    public static void main(String[] args) {
        int n = 5;
        if ((n & (n - 1)) == 0 && n != 0)
            System.out.println(true);
        else
            System.out.println(false);
    }
}