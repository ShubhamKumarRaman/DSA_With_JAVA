public class J02StringEquals {

    // Check string is euqal or not
    public static boolean CheckEquals(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hey";

        // Using Equals method
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(CheckEquals(s1, s2));
        System.out.println(CheckEquals(s1, s3));
    }
}
