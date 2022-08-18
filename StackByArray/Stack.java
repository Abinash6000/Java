public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The Stack is created with size: " + size);
    }

    // isEmpty
    public boolean isEmpty() {
        if (this.topOfStack == -1)
            return true;
        else
            return false;
    }

    // isFull
    public boolean isFull() {
        if (this.topOfStack == this.arr.length - 1) {
            // System.out.println("The Stack is full!");
            return true;
        } else {
            return false;
        }
    }

    // Push
    public void push(int value) {
        if (isFull()) {
            System.out.println("The Stack is Full!");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted!");
        }
    }

    // Pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("The Stack is empty");
            return -1;
        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }

    // Delete
    public void deleteStack() {
        arr = null;
        System.out.println("The Stack is successfully deleted!");
    }
}
