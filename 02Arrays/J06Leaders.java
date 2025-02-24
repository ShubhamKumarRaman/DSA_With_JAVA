import java.util.ArrayList;

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

    public static void main(String args[]) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        ArrayList<Integer> result = UsingNestedLoop(arr);
        System.out.print("Leaders are: ");
        for (int x : result) {
            System.out.print(x + "  ");
        }
    }
}
