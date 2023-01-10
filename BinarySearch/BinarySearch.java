public class BinarySearch {
    public static int binarySearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        int middle = (start + end) / 2;
        while (arr[middle] != value && start <= end) {
            if (arr[middle] < value) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
            middle = (start + end) / 2;
        }
        if (arr[middle] == value)
            return middle;
        else
            return -1;
    }
}
