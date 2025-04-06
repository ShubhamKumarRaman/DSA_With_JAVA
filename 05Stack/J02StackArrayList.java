import java.util.ArrayList;
import java.util.Scanner;

public class J02StackArrayList {
    private ArrayList<Integer> stackList;

    public J02StackArrayList() {
        stackList = new ArrayList<>();
    }

    // Check Stack is Empty or not
    public boolean isEmpty() {
        return (stackList.size() == 0);
    }

    // Push
    public void push(int data) {
        stackList.add(data);
        System.out.println(data + " pushed into stack.");
    }

    // Pop
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty. ");
            return;
        }
        int value = stackList.get(stackList.size() - 1);
        stackList.remove(stackList.size() - 1);
        System.out.println(value + " popped from stack.");
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
            return -1;
        }
        return stackList.get(stackList.size() - 1);
    }

    // Display
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
            return;
        }

        for (int i = stackList.size() - 1; i >= 0; i--) {
            System.out.println("|  " + stackList.get(i) + "  |");
        }
        System.out.println("--------");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Stack: ");
        int size = sc.nextInt();
        J02StackArrayList s = new J02StackArrayList();
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