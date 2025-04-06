import java.util.Scanner;

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
            System.out.println(data + " is pushed to stack.");
        }
    }

    // Pop
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.........!!!");
        } else {
            int data = stackArray[top--];
            System.out.println(data + " is popped from stack.");
        }
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.........!!!");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // Display
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty....!");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println("|  " + stackArray[i] + "  |");
        }
        System.out.println("--------");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Stack: ");
        int size = sc.nextInt();
        J01StackArray s = new J01StackArray(size);
        int choice, value;
        do {
            System.out.println("------------------------------");
            System.out.println("**** Stack Operations Menu ****");
            System.out.println("0. Exit");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.print("\nEnter your choice (0-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 0:
                    // System.exit(0);
                    System.out.println("Exiting Program..............");
                    break;
                case 1:
                    System.out.print("Enter the value: ");
                    value = sc.nextInt();
                    s.push(value);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    value = s.peek();
                    if (value != -1) {
                        System.out.println(value + " is peeked from stack.");
                    }
                    break;
                case 4:
                    s.display();
                    break;
                default:
                    System.out.println("Invalid choice..! Choose correct option ......!");
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
}
