import java.util.HashSet;
import java.util.Set;

public class J01CheckSubSet {

    // My approach - applying hashset -- This approach is valid for unique element
    // subset
    public static boolean usingHashSet(int[] arr, int[] sub) {
        Set<Integer> set = new HashSet<>();
        // Insert each element
        for (int n : arr) {
            set.add(n);
        }

        // Iterate sub and check every element is present in arr or not
        for (int n : sub) {
            if (!set.contains(n)) {
                return false;
            }
            set.remove(n);
        }
        return true;
    }

    // [Naive approach] Using Nested Loops - O(m*n) Time and O(1) Space
    public static boolean usingNestedLoops(int[] arr, int[] sub) {
        int n = arr.length, m = sub.length;
        for (int i = 0; i < sub.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (sub[i] == arr[j]) {
                    found = true;
                    arr[j] = -1;
                    break;
                }
            }
            if (!found)
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        int[] a = { 11, 1, 13, 21, 3, 7 };
        int[] b = { 11, 3, 7, 1 };

        System.out.println("Subset: " + usingHashSet(a, b));
        System.out.println("Using Nested Loop: " + usingNestedLoops(a, b));
        int[] c = { 10, 5, 2, 23, 19 };
        int[] d = { 19, 5, 3 };

        System.out.println("SubSet: " + usingHashSet(c, d));
        System.out.println("Using Nested Loop: " + usingNestedLoops(c, d));

        int[] e = { 1, 2, 2 };
        int[] f = { 1, 1 };
        System.out.println("Subset: " + usingHashSet(e, f));
        System.out.println("Using Nested Loop: " + usingNestedLoops(e, f));
    }
}
