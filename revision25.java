import java.util.*;
public class revision25 {
    public static void main(String args[]) {
        int n =5;
        int bitMask = 1<<2;
        int get = n & bitMask;
        if(get == 0) {
            System.out.println("Zero");
        }else{
            System.out.println("One");
        }
    }
}
