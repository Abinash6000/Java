public class QueueArray {
    // properties of QueueArray
    int beginningOfQueue;
    int topOfQueue;
    int arr[];

    // constructor
    public QueueArray(int size) {
        this.arr = new int[size];
        this.beginningOfQueue = -1;
        this.topOfQueue = -1;
        System.out.println("Queue successfully created!");
    }

    // isFull
    public boolean isFull() {
        if (topOfQueue == arr.length - 1)
            return true;
        else
            return false;
    }

    // isEmpty
    public boolean isEmpty() {
        if (beginningOfQueue == -1 || beginningOfQueue == arr.length)
            return true;
        else
            return false;
    }

    // enQueue
    public void enQueue(int value) {
        if (isFull())
            System.out.println("Queue is full!");
        else if (isEmpty()) {
            topOfQueue++;
            arr[topOfQueue] = value;
            beginningOfQueue = 0;
            System.out.println("Success inserted " + value);
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Success inserted " + value);
        }
    }

    // deQueue
    public int deQueue() {
        if (isEmpty())
            return -1;
        else {
            if (beginningOfQueue > arr.length)
                beginningOfQueue = topOfQueue = -1;
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            return result;
        }
    }

    // peek // shows the element which is to come out. you can only peek the element
    // which were to come out.
    public int peek() {
        if (isEmpty())
            return -1;
        else {
            return arr[beginningOfQueue];
        }
    }

    // delete
    public void deleteQueue() {
        arr = null;
        System.out.println("Queue deleted!");
    }
}
