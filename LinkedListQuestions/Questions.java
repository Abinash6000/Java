import java.util.HashSet;

public class Questions {
    // Question 1- Delete duplicates
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

    // Question 2- Nth to last
    Node nthToLast(LinkedList ll, int n) {
        Node p1 = ll.head;
        Node p2 = ll.head;
        for (int i = 0; i < n; i++) {
            if (p1 == null)
                return null;
            p1 = p1.next;
        }
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }

    // Question 3- Partition
    LinkedList partition(LinkedList ll, int x) {
        Node currentNode = ll.head;
        ll.tail = ll.head;
        while (currentNode != null) {
            Node next = currentNode.next;
            if (currentNode.value < x) {
                currentNode.next = ll.head;
                ll.head = currentNode;
            } else {
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = next;
        }
        ll.tail.next = null;
        return ll;
    }

    // Question 4- Sum list

}
