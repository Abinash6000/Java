import java.util.*;

public class revision33 {
    public static void printSubsets(int n, ArrayList<Integer> al) {
        // base case
        if (n == 0) {
            for (int i = 0; i < al.size(); i++) {
                System.out.print(al.get(i));
            }
            System.out.println();
            return;
        }
        // add
        al.add(n);
        printSubsets(n - 1, al);
        // remove
        al.remove(al.size() - 1);
        printSubsets(n - 1, al);
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        printSubsets(3, al);
    }
}
