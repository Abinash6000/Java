
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        // code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // test cases
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // size
            int[] arr = { 86, 77, 15, 93, 35, 86, 92, 49, 21, 62, 27, 90, 59, 63, 26, 40, 26, 72, 36, 11, 68, 67, 29,
                    82, 30, 62, 23, 67, 35, 29, 2, 22, 58, 69, 67, 93, 56, 11, 42, 29, 73, 21, 19, 84, 37, 98, 24, 15,
                    70, 13, 26, 91, 80, 56, 73, 62, 70, 96, 81, 5, 25, 84, 27, 36, 5, 46, 29, 13, 57, 24, 95, 82, 45,
                    14, 67, 34, 64, 43, 50, 87, 8, 76, 78, 88 };
            for (int j = 0; j < n / 2; j++) {
                int temp = arr[j];
                arr[j] = arr[n - j - 1];
                arr[n - j - 1] = temp;
            }
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
        }
    }
}