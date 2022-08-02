import java.util.*;
public class Revision12 {
    public static int calcPower(int x, int n) {
        if (x ==0) return 0;
        if (n ==0) return 1;
        if (n%2==0) {
            return calcPower(x,n/2)*calcPower(x,n/2);
        }else {
            return calcPower(x,n/2)*calcPower(x,n/2)*x;
        }
    }
    public static void main(String args[]) {
        int x = 2;
        int n = 5;
        int ans = calcPower(x,n);
        System.out.println(ans);
    }
}
