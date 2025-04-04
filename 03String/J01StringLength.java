public class J01StringLength {
    // Time Complexity: O(n) Auxiliary space: O(1)
    public static int getLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    public static void main(String args[]) {
        String s = "GeeksforGeeks";
        // Using In-built methods
        System.out.println("Length: " + s.length());
        System.out.println("Length: " + getLength(s));
    }
}