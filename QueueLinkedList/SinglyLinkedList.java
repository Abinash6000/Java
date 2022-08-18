public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // First Method for creating singlylinkedlist like a creator
    public Node createSinglyLinkedList(int nodeValue) {
        this.head = new Node(); // head is pointed to a new node.
                                // this was not needed actually because we are
                                // pointing head to node in 12th line.
        Node node = new Node(); // node is pointed to a new node.
        node.next = null; // pointed the next calue of node to null
        node.value = nodeValue;
        this.head = node; // pointing the head to node created.
        this.tail = node; // pointing the tail to node.
        this.size = 1; // this.size = 1;
        return head;
    }

    // Insert Method SinglyLinkedList
    public void insertInLinkedList(int nodeValue, int location /* index */) {
        Node newNode = new Node();
        newNode.value = nodeValue;

        if (this.head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) { // add newNode to starting of linkedlist
            newNode.next = head;
            head = newNode;
        } else if (location >= this.size) {
            newNode.next = null;
            this.tail.next = newNode;
            this.tail = newNode;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) { // this loop stops at location-1 because then we can set
                                           // tempNode.next to nodeValue at location;
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next; // pointing nextNode to the node at location (before updation).
            tempNode.next = newNode; // pointing location(tempNode.next) to newNode;
            newNode.next = nextNode; // pointing "next" reference of location(newNode.next) to original
                                     // location(nextNode)
        }
        this.size++;
    }

    // SinglyLinkedList Traversal
    public void traverseSinglyLinkedList() {
        if (this.head == null)
            System.out.println("SLL does not exist");
        else {
            Node tempNode = head;
            for (int i = 0; i < this.size; i++) {
                System.out.print(tempNode.value);
                if (i != this.size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    // Search for a node
    public boolean searchNode(int nodeValue) {
        if (this.head != null) {
            Node tempNode = head;
            for (int i = 0; i < this.size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.print("Found the node at location : " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found! ");
        return false;
    }

    // Deletion of a node in Singly Linked list
    public void deletionOfNode(int location) {
        if (this.head == null) {
            System.out.println("The sLL does not exist");
            return;
        } else if (location == 0) {
            this.head = this.head.next;
            this.size--;
            if (size == 0)
                this.tail = null;
        } else if (location >= size) {
            Node tempNode = this.head;
            for (int i = 0; i < size - 2; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                this.tail = this.head = null;
                size--;
                return;
            }
            tempNode.next = null;
            this.tail = tempNode;
            size--;
        } else {
            Node tempNode = this.head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // Delete Entire SinglyLinkedList
    public void deleteSLL() {
        this.head = null;
        this.tail = null;
        System.out.println("The sLL deleted successfully");
    }
}
