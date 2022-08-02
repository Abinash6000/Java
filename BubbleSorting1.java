import java.util.*;
public class BubbleSorting1 {
    public static void main(String args[]) {
        int arr[] = {7,8,3,1,2,9,10,4,5,6};
        

        for(int i = 0; i<arr.length-1; i++) {
            for(int j = 0; j<arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i< arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
