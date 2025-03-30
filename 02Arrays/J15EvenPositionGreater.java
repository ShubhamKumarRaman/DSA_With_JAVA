import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class J15EvenPositionGreater {

    // [Approach 1] – Assign Maximum Elements to Even Positions
    public static ArrayList<Integer> rearrangeArray(ArrayList<Integer> arr) {
        Collections.sort(arr);
        int n = arr.size();
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(n, 0));
        int ptr1 = 0, ptr2 = n - 1;
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 0) {
                result.set(i, arr.get(ptr2--));
            } else {
                result.set(i, arr.get(ptr1++));
            }
        }
        return result;
    }

    // [Approach 2] – Rearranging array by swapping elements
    public static ArrayList<Integer> usingSwappingElements(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            if ((i + 1) % 2 == 0) {
                if (arr.get(i) < arr.get(i - 1)) {
                    Collections.swap(arr, i, i - 1);
                }
            } else {
                if (arr.get(i) > arr.get(i - 1)) {
                    Collections.swap(arr, i, i - 1);
                }
            }
        }
        return arr;
    }

    public static void printArrayList(ArrayList<Integer> arr) {
        for (int x : arr) {
            System.out.print(x + "  ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2, 1));
        printArrayList(rearrangeArray(arr));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1,3,2));
        printArrayList(usingSwappingElements(arr2));
    }
}
