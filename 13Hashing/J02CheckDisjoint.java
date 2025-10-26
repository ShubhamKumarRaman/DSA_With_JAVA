// Check for Disjoint Arrays or Sets
// Given two arrays a and b, check if they are disjoint, i.e., there is no element common between both the arrays.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

    // [Better Approach] Using Merge of Merge Sort - O(n Log n + m Log m) Time and
    // O(1) Space
    public static boolean usingSorting(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j])
                return false;

            if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        return true;
    }

    // [Expected Approach] Using Hashing - O(n + m) Time and O(n) Space
    public static boolean usingHashing(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (int el : a) {
            set.add(el);
        }

        for (int el : b) {
            if (set.contains(el)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int[] a = { 12, 34, 11, 9, 3 };
        int[] b = { 7, 2, 1, 5 };
        System.out.println("Using Nested Loop: " + usingNestedLoop(a, b));
        System.out.println("Using Sorting: " + usingSorting(a, b));
        System.out.println("Using Hasing: " + usingHashing(a, b));

        System.out.println();

        int[] c = { 12, 34, 11, 9, 3 };
        int[] d = { 2, 1, 3, 5 };
        System.out.println("Using Nested Loop: " + usingNestedLoop(c, d));
        System.out.println("Using Sorting: " + usingSorting(c, d));
        System.out.println("Using Hasing: " + usingHashing(c, d));
    }
}
