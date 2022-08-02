public class SelectionSort {
    public static void mian(String args[]) {
        int arr[] = { 7, 8, 3, 1, 2 };
        // selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestIndex = i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[smallestIndex] > arr[smallestIndex + 1]) {
                    smallestIndex++;
                }
            }
        }
    }
}
