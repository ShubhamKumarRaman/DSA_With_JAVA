import java.util.Arrays;

public class J01FibonacciNumber {
    // [Naive Approach] Using Recursion
    public static int nthFibonacci1(int n) {
        if (n <= 1) {
            return n;
        }
        return nthFibonacci1(n - 1) + nthFibonacci1(n - 2);
    }

    // [Expected Approach-1] Memoization Approach
    public static int fibonacci2(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        memo[n] = fibonacci2(n - 1, memo) + fibonacci2(n - 2, memo);
        return memo[n];
    }

    public static int nthFibonacci2(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return fibonacci2(n, memo);
    }

    public static void main(String args[]) {
        System.out.println("Using Recursion:- " + nthFibonacci1(5));
        System.out.println("Using Memoization:- "+nthFibonacci2(5));
        System.out.println("Using Recursion:- " + nthFibonacci1(8));
        System.out.println("Using Memoization:- "+nthFibonacci2(8));
    }
}
