import java.util.Scanner;

public class J02MultiplicationTable {

    // Iterative Approach
    public static void printTableLoop(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        System.out.println();
    }

    // Recursive Approach
    public static void printTableRecursion(int n, int i) {
        if (i == 11) {
            return;
        }
        System.out.println(n + " * " + i + " = " + (n * i));
        printTableRecursion(n, ++i);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        printTableLoop(num);
        printTableRecursion(num, 1);
    }
}
