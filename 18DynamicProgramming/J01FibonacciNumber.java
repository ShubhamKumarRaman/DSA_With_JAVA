import java.util.Arrays;

public class J01FibonacciNumber {
    // [Naive Approach] Using Recursion
    public static int nthFibonacci1(int n) {
        if (n <= 1) {
            return n;
        }
        return nthFibonacci1(n - 1) + nthFibonacci1(n - 2);
    }


    public static void main(String args[]) {
        System.out.println("Using Recursion:- " + nthFibonacci1(5));
        System.out.println("Using Recursion:- " + nthFibonacci1(8));
    }
}
