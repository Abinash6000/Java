public class CircularDoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    // Create CDLL
    DoublyNode createCDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        newNode.prev = newNode;
        size = 1;
        return newNode;
    }

    // Insertion CDLL
    void insertNode(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head == null) {
            createCDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.prev = tail;
            newNode.next = head;
            tail.next = newNode;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    // Traversal CDLL
    void traverseCDLL() {
        if (head == null) {
            System.out.println("CDLL doesn't exist!");
            return;
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1)
                    System.out.print(" --> ");
                tempNode = tempNode.next;
            }
        }
        System.out.println();
    }

    // Reverse Traversal CDLL
    void reverseTraversalCDLL() {
        if (head != null) {
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1)
                    System.out.print(" <-- ");
                tempNode = tempNode.prev;
            }
        } else {
            System.out.println("CDLL doesn't exist");
        }
    }

    // Search CDLL
    boolean searchCDLL(int nodeValue) {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Node found at location " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found!");
        return false;
    }

    // Deletion of node from CDLL
    void deleteNode(int location) {
        if (head == null) {
            System.out.println("CDLL doesn't exist!");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head.next = null;
                head.prev = null;
                head = null;
                tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;
            }
        } else if (location >= size) {
            if (size == 1) {
                head.next = null;
                head.prev = null;
                head = null;
                tail = null;
                size--;
                return;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size--;
            }
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < location - 1; i++)
                tempNode = tempNode.next;
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    // Delete Entire CDLL
    void deleteCDLL() {
        DoublyNode tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("The CDLL has been deleted!");
    }
}
