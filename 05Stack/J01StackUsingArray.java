import java.util.Scanner;

public class J01StackUsingArray {
    public static Scanner sc = new Scanner(System.in);
    static int stack[];
    static int top, size;

    // Implementation
    public class Stack {
        public Stack(int size) {
            stack = new int[size];
            top = -1;
        }
    }

    public static void main(String args[]) {
        int choice = sc.nextInt();
        while (true) {
            System.out.println("\n--------------------------------------");
            System.out.println("1. Push");
            switch (choice) {
                case 1:

                    break;

                default:
                    break;
            }
        }
    }
}
