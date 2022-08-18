public class QueueLinkedList {
    SinglyLinkedList list;

    // constructor
    public QueueLinkedList() {
        list = new SinglyLinkedList();
        System.out.println("The Queue is successfully created!");
    }

    // isEmpty
    public boolean isEmpty() {
        if (list.head == null)
            return true;
        else
            return false;
    }

    // enQueue
    public void enQueue(int value) {
        list.insertInLinkedList(value, list.size);
        System.out.println("Successfully inserted " + value + " in the queue");
    }

    // deQueue
    public int deQueue() {
        int value = -1;
        if (isEmpty())
            System.out.println("Queue is empty!");
        else {
            value = list.head.value;
            list.deletionOfNode(0);
        }
        return value;
    }

    // peek
    public int peek() {
        if (!isEmpty()) {
            return list.head.value;
        } else
            return -1;
    }

    // delteQueue
    public void deleteQueue() {
        list.head = null;
        list.tail = null;
        System.out.println("Queue is deleted successfully!");
    }
}
