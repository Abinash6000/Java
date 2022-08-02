import java.util.*;
public class Revision13 {
    public static int clacFactorial(int n) {
        if (n == 0 || n==1) return 1;
        return n*clacFactorial(n-1);
    }
    public static void main(String args[]) {
        int ans = clacFactorial(6);
        System.out.println(ans);
    }
}