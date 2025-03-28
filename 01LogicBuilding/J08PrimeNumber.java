public class J08PrimeNumber {
    // School Method
    public static boolean usingSchoolMethod(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(usingSchoolMethod(5));
        System.out.println(usingSchoolMethod(6));

    }
}
