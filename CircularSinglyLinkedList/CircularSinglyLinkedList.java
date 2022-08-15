public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Creation of CircularSinglyLinkedList
    public Node createCSLL(int nodeValue) {
        this.head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node; // In CSLL last node points to first node.
        this.head = node;
        this.tail = node;
        size = 1;
        return this.head;
    }

    // Insertion - CircularSinglyLinkedList
    public void insertCSLL(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createCSLL(nodeValue);
            return;
        } else if (location == 0) {
            node.next = this.head;
            this.head = node;
            this.tail.next = this.head;
        } else if (location >= size) {
            this.tail.next = node;
            this.tail = node;
            this.tail.next = this.head;
        } else {
            Node tempNode = this.head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    // Traversal - CircularSinglyLinkedList
    public void traversalCSLL() {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1)
                    System.out.print(" -> ");
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        } else
            System.out.println("\n CSLL does not exist");
    }

    // Searching - CircularSinglyLinkedList
    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = this.head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Fount node at location " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    // Delete Method
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The CSLL does not exit!");
            return;
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                tail = null;
                head.next = null;
                head = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 2; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // Delete Entire CircularSinglyLinkedList
    public void deleteCSLL() {
        if (head == null) {
            System.out.println("The CSLL does not exist!");
        } else {
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("The CSLL has been deleted!");
        }
    }
}