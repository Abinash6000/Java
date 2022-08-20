
//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends

class Solution {
    public static void conquer(ArrayList<Integer> duplicate, int si, int ei, int mid) {
        int[] merged = new int[ei - si + 1];
        int x = 0;
        int idx1 = si;
        int idx2 = mid + 1;
        while (idx1 <= mid && idx2 <= ei) {
            if (duplicate.get(idx1) <= duplicate.get(idx2))
                merged[x++] = duplicate.get(idx1++);
            else
                merged[x++] = duplicate.get(idx2++);
        }
        while (idx1 <= mid) {
            if (duplicate.get(idx1) <= duplicate.get(idx2))
                merged[x++] = duplicate.get(idx1++);
        }
        while (idx2 <= ei) {
            if (duplicate.get(idx2) <= duplicate.get(idx1))
                merged[x++] = duplicate.get(idx2++);
        }
        // copy
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            duplicate.remove(j);
            duplicate.add(j, merged[i]); // replace not add.
        }
    }

    public static void divide(ArrayList<Integer> duplicate, int si, int ei) {
        if (si >= ei)
            return;
        int mid = si + (ei - si) / 2;
        divide(duplicate, si, mid - 1);
        divide(duplicate, mid + 1, ei);
        conquer(duplicate, si, ei, mid);
    }

    public static void mergeSort(ArrayList<Integer> duplicate) {
        divide(duplicate, 0, duplicate.size() - 1);
    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> duplicate = new ArrayList<>();
        HashSet<Integer> storeUniques = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (storeUniques.contains(arr[i]) && !duplicate.contains(arr[i])) {
                duplicate.add(arr[i]);
            } else {
                storeUniques.add(arr[i]);
            }
        }
        if (duplicate.size() == 0) {
            duplicate.add(-1);
            return duplicate;
        } else {
            // Sort
            mergeSort(duplicate);
            return duplicate;
        }
    }
}
