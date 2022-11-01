class Rough {
    public static void conquer(int arr[], int si, int ei, int mid) {
        int merged[] = new int[ei - si];
        int x = 0;
        int idx1 = si;
        int idx2 = mid + 1;
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2])
                merged[x++] = arr[idx1++];
            else
                merged[x++] = arr[idx2++];
        }
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }
        for (int i = si, j = 0; j < merged.length; i++, j++) {
            arr[i] = merged[j];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei)
            return;
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, ei, mid);
    }

    public static int Maximize(int arr[], int n) {
        // Complete the function
        int max = 0;
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            max += arr[i] * i;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2 };
        System.out.println(Maximize(arr, 3));
    }
}
