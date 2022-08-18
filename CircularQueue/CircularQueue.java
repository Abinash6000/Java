public class CircularQueue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    // constructor
    public CircularQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The CQ is successfully created with size of " + size);
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
        // case 1-> beginningOfQueue is at starting index and topOfStack reached end
        // index.
        // case 2-> the next index of topOfQueue is beginningOfQueue (when
        // biginningOfQueue != 0).
        if (topOfQueue + 1 == beginningOfQueue)
            return true;
        else if (beginningOfQueue == 0 && topOfQueue + 1 == size)
            return true;
        else
            return false;
    }

    // enQueue
    public void enQueue(int value) {
        // c1 -> queue is full(we can't add anymore.)
        // c2 -> queue is empty(remove '-1' value of top and beginning)
        // c3 -> all other cases(topOfQueue++) (if topOfQueue at last index then
        // topOfQueue = 0 ,for adding more elements.)
        if (isFull()) // if Queue is full then we can't add more elements.
            System.out.println("Queue is full!");
        else if (isEmpty()) { // if Queue is empty then we need to remove the '-1' value of topOfQueue and
                              // beginningOfQueue and add the value at topOfQueue
            beginningOfQueue = 0;
            topOfQueue = 0;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        } else { // add element at the next position of topOfQueue
            if (topOfQueue + 1 == size) { // if we are at the last index of array.
                topOfQueue = 0;
            } else {
                topOfQueue++; // if we are not at the last index of array.
            }
            arr[topOfQueue] = value; // add the value at the topOfQueue.
            System.out.println("Successfully inserted " + value + " in the queue");
        }
    }

    // deQueue
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The Queue is empty");
            return -1;
        } else {
            int result = arr[beginningOfQueue];// stored the element at beginning of queue to return it at the end.
            arr[beginningOfQueue] = 0; // made the element at beginning of Queue to zero.
            // case 1 --> when beginningOfQueue is last element. (Means when there is only
            // one element in arr.)
            // case 2 --> when beginningOfQueue is at last index of arr.
            // case 3 --> when there are sufficient elements.(all other cases.)
            if (beginningOfQueue == topOfQueue) { // this means that it was the last element and after returning it the
                                                  // queue becomes empty.
                beginningOfQueue = topOfQueue = -1;// the queue becomes empty so we do this step.
            } else if (beginningOfQueue + 1 == size) {// if by using deQueue we reach the condition when
                                                      // beginningOfQueue is at last indix, then we have to set
                                                      // beginningOfQueue to '0'.
                beginningOfQueue = 0;// Because element at the last index is deQueued and we need to set next element
                                     // as beginningOfQueue.
            } else {
                beginningOfQueue++;// We are deQueuing the current element so we have to got to the next element.
                                   // The element is removed at the second line of else statement.
            }
            return result; // Returning the removed element.
        }
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            return arr[beginningOfQueue];
        }
    }

    // deleteQueue
    public void deleteQueue() {
        this.arr = null;
        System.out.println("Queue deleted!");
    }
}
