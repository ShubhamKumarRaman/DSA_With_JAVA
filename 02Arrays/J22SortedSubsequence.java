import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J22SortedSubsequence {
    public static ArrayList<Integer> find3Sequence(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n - 1; i++) {
            // Find smaller
            int smaller = -1, greater = -1;
            for (int k = i - 1; k >= 0; k--) {
                if (arr[i] > arr[k]) {
                    smaller = arr[k];
                }
            }

            // Find greater
            for (int k = i + 1; k < n; k++) {
                if (arr[i] < arr[k]) {
                    greater = arr[k];
                }
            }

            if (smaller == -1 || greater == -1) {
                continue;
            } else {
                return new ArrayList<>(Arrays.asList(smaller, arr[i], greater));
            }
        }
        return new ArrayList<>(List.of(0));
    }

    public static void main(String args[]) {
        int arr[] = { 12, 11, 10, 5, 6, 2, 30 };
        ArrayList<Integer> result = find3Sequence(arr);
        for (int el : result) {
            System.out.print(el + "  ");
        }
    }
}
