public class InsertionSort {

    void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currElement = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > currElement) {
                    // jagah banao
                    arr[j + 1] = arr[j];
                } else {
                    arr[j + 1] = currElement;
                    break;
                }
            }
        }
    }

    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
