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

    public static void printArrayList(ArrayList<Integer> arr) {
        for (int x : arr) {
            System.out.print(x + "  ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2, 1));
        printArrayList(rearrangeArray(arr));
    }
}
