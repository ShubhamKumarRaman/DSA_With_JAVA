import java.util.Scanner;

public class J04Swapping {
    // Using Three Variables
    public static void usingtemp(int a, int b) {
        System.out.print("Using temp veriable:- ");
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nFirst Number: " + a + "\nSecond Number: " + b);
        System.out.println();
    }

    // Using Two Variables
    public static void usingTwoVar(int a, int b) {
        System.out.print("Using Two variables:-");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("\nFirst Number: " + a + "\nSecond Number: " + b);
        System.out.println();
    }

    // Using Single Statement
    public static void usingSingleStmt(int a, int b) {
        System.out.print("Using Single statement:- ");
        b = a + b - (a = b);
        System.out.println("\nFirst Number: " + a + "\nSecond Number: " + b);
        System.out.println();
    }

    // Using XOR operator
    public static void usingXOR(int a, int b) {
        System.out.print("Using XOR Operator:- ");
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("\nFirst Number: " + a + "\nSecond Number: " + b);
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();

        usingtemp(a, b);
        usingTwoVar(a, b);
        usingSingleStmt(a, b);
        usingXOR(a, b);
    }
}