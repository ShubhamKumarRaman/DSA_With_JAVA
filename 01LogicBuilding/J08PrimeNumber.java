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

    // Optimized School Method
    public static boolean usingOptSchoolMethod(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println("5 " + usingSchoolMethod(5));
        System.out.println("6 " + usingSchoolMethod(6));
        System.out.println("16 " + usingOptSchoolMethod(16));
        System.out.println("17 " + usingOptSchoolMethod(17));
    }
}
