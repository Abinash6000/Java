import java.util.*;
public class RecursionXPowerNWithLessTimeComplexity {
    public static int calcPower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n==0) {
            return 1;
        }
        // if even power
        if (n%2 == 0) {
            int powern = calcPower(x, n/2) * calcPower(x, n/2);
            return powern;
        } else {
            // if odd power
            int powern = calcPower(x,n/2) * calcPower(x, n/2) * x ;
            return powern;
        }
    }
    public static void main(String args[]) {
        System.out.println(calcPower(2,5));
    }
}
