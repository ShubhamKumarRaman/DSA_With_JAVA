public class J02CheckDisjoint {
    // [Naive Approach] Using Two Nested Loops - O(n x m) Time and O(1) Space
    public static boolean usingNestedLoop(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int[] a = { 12, 34, 11, 9, 3 };
        int[] b = { 7, 2, 1, 5 };
        System.out.println("Using Nested Loop: "+usingNestedLoop(a, b));

        int[] c = {12, 34, 11, 9, 3};
        int[] d = {2, 1, 3, 5};
        System.out.println("Using Nested Loop: "+usingNestedLoop(c, d));
    }
}
