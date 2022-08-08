public class Revision42 {
    public static void conquer(int[] arr, int si, int ei, int mid) {
        int x = 0;
        int[] merged = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] >= arr[idx2])
                merged[x++] = arr[idx2++];
            else
                merged[x++] = arr[idx1++];
        }
        while (idx1 <= mid)
            merged[x++] = arr[idx1++];
        while (idx2 <= ei)
            merged[x++] = arr[idx2++];
        // copy
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei)
            return;
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid); // divide
        divide(arr, mid + 1, ei);
        conquer(arr, si, ei, mid);
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2, 8 };
        divide(arr, 0, arr.length - 1);
        // print
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
