import java.util.ArrayList;
import java.util.Collections;

public class J06Leaders {
    // [Naive Approach] Using Nested Loops – O(n^2) Time and O(1) Space
    public static ArrayList<Integer> UsingNestedLoop(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    break;
                }
            }
            if (j == n) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    // [Expected Approach] Using Suffix Maximum – O(n) Time and O(1) Space:
    public static ArrayList<Integer> UsingSuffix(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int MaxRight = arr[arr.length - 1];
        result.add(MaxRight);

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > MaxRight) {
                MaxRight = arr[i];
                result.add(arr[i]);
            }
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String args[]) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        ArrayList<Integer> result = UsingNestedLoop(arr);
        System.out.print("Leaders are: ");
        for (int x : result) {
            System.out.print(x + "  ");
        }
        System.out.println("\n-----------------------");
        ArrayList<Integer> result2 = UsingSuffix(arr);
        System.out.print("Leaders are: ");
        for (int x : result2) {
            System.out.print(x + "  ");
        }
    }
}
