class Main {
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int[] arr = { 1, 2, 5, 7, 2, 53, 7, 3, 121, 8, 32, 12, 87, 34 };
        is.insertionSort(arr);
        is.printArray(arr);
    }
}