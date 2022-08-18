class Main {
    public static void main(String[] args) {
        QueueLinkedList newQll = new QueueLinkedList();
        newQll.enQueue(10);
        newQll.enQueue(20);
        newQll.enQueue(30);
        System.out.println(newQll.deQueue());
        System.out.println(newQll.deQueue());
        newQll.deleteQueue();
    }
}