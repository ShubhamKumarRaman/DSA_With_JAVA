public class J07ReverseDigit {
    // Reversing Digit by Digit
    public static int usingDigitbyDigit(int num) {
        int revNum = 0;
        while (num > 0) {
            revNum = (revNum * 10) + num % 10;
            num /= 10;
        }
        return revNum;
    }

    // Using String
    public static int usingString(int n) {
        StringBuffer sb = new StringBuffer(String.valueOf(n));
        sb.reverse();
        n = Integer.parseInt(String.valueOf(sb));
        return n;
    }

    public static void main(String args[]) {
        System.out.println("Reverse of 1234: " + usingDigitbyDigit(1234));
        System.out.println("Reverse of 2468: " + usingDigitbyDigit(2468));

    }
}
