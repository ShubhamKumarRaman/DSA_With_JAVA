public class J04InsertACharacter {
    // [Approach-1] Using Built-In Methods
    public static String insertCharacter(StringBuilder s, int pos, char ch) {
        s.insert(pos, ch);
        return s.toString();
    }

    // [Approch-2] Using Custom Method
    public static String insertCharacter2(String s, int pos, char ch){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(pos==i){
                sb.append(ch);
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Helo");
        System.out.println(insertCharacter(sb, 2, 'l'));

        String str = "Helo";
        System.out.println(insertCharacter2(str, 3, 'L'));
    }
}
