public class ThreeInOne {
    private int numberOfStack = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeInOne(int stackSize) {
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStack];
        sizes = new int[numberOfStack];
    }

    // isFull
    public boolean isFull(int stackNum) {
        if (sizes[stackNum] == stackCapacity)
            return true;
        else
            return false;
    }

    // isEmpty
    public boolean isEmpty(int stackNum) {
        if (sizes[stackNum] == 0)
            return true;
        else
            return false;
    }

    // indexOfTop
    public int indexOfTop(int stackNum) {
        int offset = stackCapacity * stackNum;
        int size = sizes[stackNum];
        return offset + size - 1;
    }

    // push
    public void push(int stackNum, int value) {
        if (isFull(stackNum))
            System.out.println("The Stack is full!");
        else {
            sizes[stackNum]++;
            values[indexOfTop(stackNum)] = value;
        }
    }

    // pop
    public int pop(int stackNum) {
        if (isEmpty(stackNum))
            return -1;
        else {
            int topIndex = indexOfTop(stackNum);
            int value = values[topIndex];
            values[topIndex] = 0;
            sizes[stackNum]--;
            return value;
        }
    }

    // peek
    public int peek(int stackNum) {
        if (isEmpty(stackNum))
            return -1;
        int topIndex = indexOfTop(stackNum);
        int value = values[topIndex];
        return value;
    }
}
