class Main {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int arr[] = { 1, 9, 2, 6, 3, 7, 8, 3, 1, 7, 2, 7, 9 };
        bs.bubbleSort(arr);
        bs.displayArr(arr);
    }
}