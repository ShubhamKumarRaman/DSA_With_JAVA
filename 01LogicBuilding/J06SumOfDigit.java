public class J06SumOfDigit {
    // Iterative Approach
    public static int usingIterative(int num) {
        int digit, sum = 0;
        while (num != 0) {
            digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.println("Sum is : "+usingIterative(1325));
    }
}
