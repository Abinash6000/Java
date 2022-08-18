public class CircularQueue {
    int arr[];
    int beginningOfQueue;
    int topOfQueue;
    int size;

    // constructor
    public CircularQueue(int size) {
        this.arr = new int[size];
        this.beginningOfQueue = -1;
        this.topOfQueue = -1;
        this.size = size;
    }

    // isEmpty
    public boolean isEmpty() {
        if (topOfQueue == -1)
            return true;
        else
            return false;
    }

    // isFull
    public boolean isFull() {
        if (topOfQueue + 1 == size && beginningOfQueue == 0)
            return true;
        else if (topOfQueue + 1 == beginningOfQueue)
            return true;
        else
            return false;
    }

    // enQueue
    public void enQueue(int value) {
        if (isEmpty()) {
            topOfQueue = 0;
            beginningOfQueue = 0;
            arr[topOfQueue] = value;
        } else if (isFull()) {
            System.out.println("Queue is full!");
        } else {
            if (topOfQueue + 1 == size)
                topOfQueue = 0;
            else
                topOfQueue++;
        }
        arr[topOfQueue] = value;
    }

    // deQueue
    public int deQueue() {
        // c1 - if empty
        // c2 - we are removing the last element
        // c4 - we are removing from the last index of array
        // c3 - all other cases
        if (isEmpty())
            return -1;
        int result = arr[beginningOfQueue];
        arr[beginningOfQueue] = 0;
        if (beginningOfQueue == topOfQueue) {
            beginningOfQueue = -1;
            topOfQueue = -1;
        } else {
            if (beginningOfQueue + 1 == size) {
                beginningOfQueue = 0;
            } else {
                beginningOfQueue++;
            }
        }
        return result;
    }
}
