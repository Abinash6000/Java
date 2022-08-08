class Revision41 {
    public static int partition(int arr[], int low, int high) {
        int i = -1;
        int pivot = arr[high];
        for (int j = 0; j < high; j++) {
            if (arr[j] < pivot) {
                // swap
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[high];
        arr[high] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2, 8 };
        quickSort(arr, 0, arr.length - 1);
        // print
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}