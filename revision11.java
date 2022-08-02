import java.util.*;
public class revision11 {
    public static int calcPower(int x, int n) {
        if (n==0) {
            return 1;
        }
        if (x==0) {
            return 0;
        }
        int powernm1 = calcPower(x, n-1);
        int powern = x*powernm1;
        return powern;
    }
    public static void main(String args[]) {
        int n = 5;
        int x = 2;
        int ans = calcPower(x, n);
        System.out.println(ans);
    } 
}
