import java.util.*;
public class SelectionSort1 {
    public static void main(String args[]) {
        int arr[] = {7,8,3,1,2};

        for (int i = 0; i< arr.length-1; i++ ) { 
            //Bubble sort
            for (int j = 0; j< arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    //Swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i =0; i<arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
