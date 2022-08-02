import java.util.*;

import java.util.*;
public class revision1 {
    public static void main(String args[]) {
        int number = 3;
    int count = 0;
    while (number!=0) {
        number = number & number-1;
        count++;
    }
    System.out.println(count);
    }
}