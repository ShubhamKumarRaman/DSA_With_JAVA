public class J03CircularLock {
    // Approach 1:- By finding absolute value difference
    public static int minRotation(int r, int d) {
        int r1 = r, d1 = d;
        int result = 0;

        while (r1 != 0 && d1 != 0) {
            int digit1 = r1 % 10;
            int digit2 = d1 % 10;
            // int diff = Math.min((10 + digit1) - digit2, (10 + digit2) - digit1);
            result += Math.min(Math.abs(digit1 - digit2), Math.min((10 + digit1) - digit2, (10 + digit2) - digit1));
            r1 /= 10;
            d1 /= 10;
        }
        return result;
    }

    public static void main(String args[]) {
        int r = 2345, d = 5432;

        System.out.println(minRotation(r, d));
    }
}
