import java.util.ArrayList;
import java.util.HashSet;

public class J08RemoveDuplicate {
    // Using Hash Set – Works for Unsorted Also – O(n) Time and O(n) Space
    public static int usingHashSet(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                arr[index++] = arr[i];
            }
        }
        return index;
    }

    // Expected Approach – O(n) Time and O(1) Space
    public static int usingPreviousCheck(int arr[]) {
        int n = arr.length;
        if (n <= 1) {
            return n;
        }

        int index = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index++] = arr[i];
            }
        }
        return index;
    }

    // Check new Previous element and add unique elements
    public static ArrayList<Integer> usingReturnArrayList(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();

        if (arr.length <= 1) {
            return result;
        }
        result.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int newSize = usingHashSet(arr);
        System.out.print("Unique elements:- ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + "  ");
        }

        int arr2[] = { 2, 2, 2, 2, 2 };
        int newSize2 = usingPreviousCheck(arr2);
        System.out.print("\nUnique elements:- ");
        for (int i = 0; i < newSize2; i++) {
            System.out.print(arr2[i] + "  ");
        }

        int arr3[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        ArrayList<Integer> result = usingReturnArrayList(arr3);
        System.out.print("\nUnique elements:- ");
        for (int x : result) {
            System.out.print(x + "  ");
        }
    }
}
