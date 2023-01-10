class Main {
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int[] arr = { 3, 5, 2, 6, 1, 8, 123, 7, 87, 23, 7, 123, 8, 1, 8 };
        ss.selectionSort(arr);
        ss.printArray(arr);
    }
}