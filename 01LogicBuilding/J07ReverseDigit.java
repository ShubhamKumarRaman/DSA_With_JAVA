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

    public static void main(String args[]) {
        System.out.println("Reverse of 1234: " + usingDigitbyDigit(1234));
    }
}
