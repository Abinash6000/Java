public class CheckSorted {
    public static boolean checkSorted(int arr[], int idx) {
        if (arr[idx] == arr.length - 1 && arr[idx] > arr[idx - 1]) {
            return true;
        }
        if (arr[idx] > arr[idx - 1]) {
            return checkSorted(arr, idx + 1);
        } else
            return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6, 1 };
        boolean ans = checkSorted(arr, 1);
        System.out.println(ans);
    }
}