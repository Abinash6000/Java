import java.util.*;
public class revision15 {
    public static void main(String args[]) {
        int arr[] = {7,8,3,1,2};
        for (int i = 0; i< arr.length-1; i++) {
            for (int j = 0; j< arr.length-1-i; j++) {
                if (arr[j+1]< arr[j]) {
                    //Swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp; 
                }
            }
        }
        for (int k = 0; k<arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
