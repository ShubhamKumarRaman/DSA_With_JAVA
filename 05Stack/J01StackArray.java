public class J01StackArray {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public J01StackArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Check Stack is Empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check Stack is Full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Push
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is Full........!!!");
        } else {
            stackArray[++top] = data;
            System.out.println(data + " is pushed.");
        }
    }

    public static void main(String args[]) {

    }
}
