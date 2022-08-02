public class revision21 {
    public static void min_max(int a[], int n) {
        int min_val = Integer.MAX_VALUE;
        int max_val = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > max_val) {
                max_val = a[i];
            }
            if (a[i] < min_val) {
                min_val = a[i];
            }
        }
    }

    public static void main(String args[]) {
    }
}
