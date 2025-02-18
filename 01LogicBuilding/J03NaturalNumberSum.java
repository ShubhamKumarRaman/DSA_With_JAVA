import java.util.Scanner;

public class J03NaturalNumberSum {
    // [Naive Approach] Loop Based Summation
    public static int usingLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    // [Expected Approach] Formula Based Method
    // Sum of first n natural numbers = (n * (n+1)) / 2
    public static int usingFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(usingLoop(num));
        System.out.println(usingFormula(num));
    }
}
