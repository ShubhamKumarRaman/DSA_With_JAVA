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

    // Recursive Approach
    public static int usingRecursive(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + (usingRecursive(num / 10));
    }

    // Taking Input Number as String
    public static int usingStringInput(String num) {
        int digit, sum = 0;
        for (int i = 0; i < num.length(); i++) {
            digit = num.charAt(i) - '0';
            sum += digit;
        }
        return sum;
    }
    
    public static void main(String args[]) {
        System.out.println("Sum is : " + usingIterative(1325));
        System.out.println("Sum is : " + usingRecursive(1562));
        System.out.println("Sum is : " + usingStringInput("2253"));
    }
}
