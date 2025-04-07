import java.util.Scanner;
import java.util.Stack;
import java.util.Collections;

public class J04StackCollections {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();

        int choice, value;
        do {
            System.out.println("-----------------------");
            System.out.println("0. Exit");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exiting program...");
                    break;
                case 1:
                    System.out.print("Enter the value: ");
                    value = sc.nextInt();
                    s.push(value);
                    break;
                case 2:
                    if (s.isEmpty()) {
                        System.out.println("Stack Underflow!");
                    } else {
                        value = s.pop();
                        System.out.println(value + " Deleted...!");
                    }
                    break;
                case 3:
                    if (s.isEmpty()) {
                        System.out.println("Stack Underflow!");
                    } else {
                        value = s.peek();
                        System.out.println(value + " is the top value.");
                    }
                    break;
                case 4:
                    if (s.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack elements are:");
                        for (int i = s.size() - 1; i >= 0; i--) {
                            System.out.println("|  " + s.get(i) + "  |");
                        }
                        System.out.println("--------");
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 0 to 4.");
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
}
