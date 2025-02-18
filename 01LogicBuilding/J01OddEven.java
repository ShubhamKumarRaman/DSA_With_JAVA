import java.util.Scanner;

public class J01OddEven {
    // Approach: By Finding the Remainder
    public static void usingRemainder(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    // Approach: By using Ternary Operator
    public static void usingTernary(int n) {
        System.out.println(n % 2 == 0 ? "Even" : "Odd");
    }

    // Approach: Using Bitwise AND Operator
    public static void usingBitwise(int n) {
        if ((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    // Approach: Using Bitwise Shift Operators
    public static void usingBitShift(int n) {
        if (n == (n >> 1) << 1) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        usingRemainder(num);
        usingTernary(num);
        usingBitwise(num);
        usingBitShift(num);
    }
}