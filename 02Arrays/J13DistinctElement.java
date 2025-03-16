import java.util.ArrayList;

public class J13DistinctElement {
    // [Naive Approach] Using Nested loops – O(n^2) Time and O(1) Space
    public static ArrayList<Integer> usingNestedLoop(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (i == j) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    // Print List
    public static void printList(ArrayList<Integer> result) {
        for (int x : result) {
            System.out.print(x + "  ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45 };
        ArrayList<Integer> result = usingNestedLoop(arr);
        printList(result);
    }
}
