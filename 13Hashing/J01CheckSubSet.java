import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

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

    // [Better Approach] Using Sorting and Two Pointer
    public static boolean usingTwoPointer(int[] arr, int[] sub) {
        Arrays.sort(arr);
        Arrays.sort(sub);

        int i = 0, j = 0;
        while (i < arr.length && j < sub.length) {
            if (arr[i] < sub[j]) {
                i++;
            } else if (arr[i] == sub[j]) {
                i++;
                j++;
            } else {
                return false;
            }
        }
        return j == sub.length;
    }

    // [Expected Approach] Using Hashing - O(n + m) Time and O(n) Space
    public static boolean usingHashing(int[] arr, int[] sub) {
        HashSet<Integer> set = new HashSet<>();

        for (int el : arr) {
            set.add(el);
        }

        for (int el : sub) {
            if (!set.contains(el)) {
                return false;
            }
        }
        return true;
    }

    // Using HashMap
    public static boolean usingHashMap(int[] arr, int[] sub) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Count frequency of number
        for (int n : arr) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        // Check the frequency is equal or not
        for (int n : sub) {
            if (!freq.containsKey(n) || freq.get(n) == 0) {
                return false;
            }
            freq.put(n, freq.get(n) - 1);
        }
        return true;
    }

    public static void main(String args[]) {
        int[] a = { 11, 1, 13, 21, 3, 7 };
        int[] b = { 11, 3, 7, 1 };

        System.out.println("Subset: " + usingHashSet(a, b));
        System.out.println("Using Nested Loop: " + usingNestedLoops(a, b));
        System.out.println("Using Two Pointer: " + usingTwoPointer(a, b));
        System.out.println("Using Hasibng : " + usingHashing(a, b));
        System.out.println("Using HashMap: " + usingHashMap(a, b));

        int[] c = { 10, 5, 2, 23, 19 };
        int[] d = { 19, 5, 3 };

        System.out.println("SubSet: " + usingHashSet(c, d));
        System.out.println("Using Nested Loop: " + usingNestedLoops(c, d));
        System.out.println("Using Two Pointer: " + usingTwoPointer(c, d));
        System.out.println("Using Hasibng : " + usingHashing(c, d));
        System.out.println("Using HashMap: " + usingHashMap(c, d));

        int[] e = { 1, 2, 2 };
        int[] f = { 1, 1 };
        System.out.println("Subset: " + usingHashSet(e, f));
        System.out.println("Using Nested Loop: " + usingNestedLoops(e, f));
        System.out.println("Using Two Pointer: " + usingTwoPointer(e, f));
        System.out.println("Using Hasibng : " + usingHashing(c, d));
        System.out.println("Using HashMap: " + usingHashMap(c, d));
    }
}
