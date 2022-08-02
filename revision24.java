import java.util.*;
import java.lang.Math;
public class revision24 {
    public static void main(String args[]) {
        String n[] = {"a","b","c"};
        for (int i = 0; i< Math.pow(2,n.length); i++) {
            for(int j = 0; j<n.length; j++) {
                if ((i & (1<<j))) {
                    System.out.print(n[j] + " ");
                }
            }
            System.out.println();
        }
    }
}