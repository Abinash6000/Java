import java.util.LinkedList;
import java.util.Scanner;

public class LL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        while (true) {
            System.out.println("Enter integer");
            int i = sc.nextInt();
            if (i > 50 || i < 1) {
                System.out.println("Enter Integer between 1 and 50");
                continue;
            }
            list.add(i);
            System.out.println("Add more?");
            String ch = sc.next();
            if ("yes".contains(ch))
                continue;
            else
                break;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > 25) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
