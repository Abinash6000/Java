class Main {
    public static void main(String[] args) {
        CircularQueue newCQ = new CircularQueue(3);
        newCQ.enQueue(1);
        newCQ.enQueue(2);
        newCQ.enQueue(3);
        newCQ.deleteQueue();

    }
}