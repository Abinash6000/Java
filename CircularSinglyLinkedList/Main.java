class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(6);
        csll.insertCSLL(4, 0);
        csll.insertCSLL(5, 1);
        csll.insertCSLL(7, 8);
        csll.traversalCSLL();
        csll.deleteCSLL();
        csll.traversalCSLL();

    }
}