public class J04InsertACharacter {
    // [Approach-1] Using Built-In Methods
    public static String insertCharacter(StringBuilder s, int pos, char ch) {
        s.insert(pos, ch);
        return s.toString();
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Helo");
        System.out.println(insertCharacter(sb, 2, 'l'));
    }
}
