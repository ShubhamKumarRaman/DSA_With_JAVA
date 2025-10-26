
// Check if two arrays are equal or not
import java.util.Arrays;

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

    public static void main(String args[]) {
        int[] a = { 3, 5, 2, 5, 2 };
        int[] b = { 2, 3, 5, 5, 2 };
        System.out.println("Using Sorting: " + usingSorting(a, b));
        System.out.println();
        int[] c = { 1, 7, 1 };
        int[] d = { 7, 7, 1 };
        System.out.println("Using Sorting: " + usingSorting(c, d));
    }
}
