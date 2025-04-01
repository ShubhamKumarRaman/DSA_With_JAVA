import java.util.Scanner;

public class J01StackUsingArray {
    public static Scanner sc = new Scanner(System.in);
    static int stack[];
    static int top, size;

    // Implementation
    public static class Stack {
        public Stack(int size) {
            stack = new int[size];
            top = -1;
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter size of Stack: ");
        int n = sc.nextInt();
        Stack st = new Stack(n);
        System.out.println("Size: " + size);
        while (true) {
            System.out.println("\n--------------------------------------");
            System.out.println("0. Exit");
            System.out.println("1. Push");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:

                    break;

                default:
                    break;
            }
        }
    }
}
