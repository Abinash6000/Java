import java.util.*;
public class revision2 {
    public static void main(String args[]) {
        int x = 8;
        int m = x&(x-1);
        if (x!=0 && m==0) {
            System.out.println(1);
        }else System.out.println(0);
    }
}
