
// Check if two arrays are equal or not
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class J03CheckEquals {

    // [Naive Approach] Using Sorting - O(n*log n) Time and O(1) Space
    public static boolean usingSorting(int[] a, int[] b) {

        if (a.length != b.length)
            return false;

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    // Using Hashing with count Occurrence
    public static boolean usingCountOccurrence(int[] a, int[] b) {
        if (a.length != b.length)
            return false;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int el : a) {
            freq.put(el, freq.getOrDefault(el, 0) + 1);
        }

        for (int el : b) {
            if (!freq.containsKey(el) || freq.get(el) == 0) {
                return false;
            }
            freq.put(el, freq.get(el) - 1);
        }

        for (int count : freq.values()) {
            if (count != 0)
                return false;
        }

        return true;
    }

    // [Expected Approach] Using Hashing- O(n) Time and O(n) Space
    public static boolean usingHashMap(int[] a, int[] b) {
        if (a.length != b.length)
            return false;

        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;
        for (int el : a) {
            if (map.get(el) == null) {
                map.put(el, 1);
            } else {
                count = map.get(el);
                count++;
                map.put(el, count);
            }
        }

        for (int el : b) {
            if (!map.containsKey(el))
                return false;
            if (map.get(el) == 0)
                return false;

            count = map.get(el);
            count--;
            map.put(el, count);
        }
        return true;
    }

    public static void main(String args[]) {
        int[] a = { 3, 5, 2, 5, 2 };
        int[] b = { 2, 3, 5, 5, 2 };
        System.out.println("Using Sorting: " + usingSorting(a, b));
        System.out.println("Using Count Occurrence: " + usingCountOccurrence(a, b));
        System.out.println("Using Hashing: " + usingHashMap(a, b));
        System.out.println();
        int[] c = { 1, 7, 1 };
        int[] d = { 7, 7, 1 };
        System.out.println("Using Sorting: " + usingSorting(c, d));
        System.out.println("Using Count Occurrence: " + usingCountOccurrence(c, d));
        System.out.println("Using Hashing: " + usingHashMap(c, d));
    }
}
