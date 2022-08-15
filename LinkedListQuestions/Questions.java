import java.util.HashSet;

public class Questions {
    void deleteDups(LinkedList ll) {
        HashSet<Integer> hs = new HashSet<>();
        Node current = ll.head;
        Node prev = null;
        while (current != null) {
            int curVal = current.value;
            if (hs.contains(curVal)) {
                prev.next = current.next;
                ll.size--;
            } else {
                hs.add(curVal);
                prev = current;
            }
            current = current.next;
        }
    }
}
