public class revision {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int min_val = Integer.MAX_VALUE;
        int max_val = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min_val > arr[i]) {
                min_val = arr[i];
            }
            if (max_val < arr[i]) {
                max_val = arr[i];
            }
        }
        System.out.println("MIN = " + min_val + " MAX = " + max_val);
    }
}
