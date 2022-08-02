import java.util.*;
public class revision5 {
    public static void main(String args[]) {
        int n = 0;
        int i = 3;
        int bitMask = 1<<(i);
        if ((n&bitMask) !=0 ) {
            System.out.println("Set");
        }else System.out.println("Not Set");

    }
}
