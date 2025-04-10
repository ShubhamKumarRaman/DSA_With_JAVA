public class J03SearchCharacter {
    // Approach - By traversing the string - O(n) Time and O(1) Space
    public static int SearchChar(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    // Approach - By Using in-built library functions - O(n) Time and O(1) Space
    public static int SearchCharBuiltin(String str, char c) {
        return str.indexOf(c);
    }

    public static void main(String args[]) {
        String s = "geeksforgeeks";
        char ch = 'k';

        System.out.println(SearchChar(s, ch));
        System.out.println(SearchCharBuiltin(s, ch));
    }
}