import java.util.ArrayList;

public class J09SubStrings {
    // Iterative Approach
    public static void usingIteration(ArrayList<Integer> arr) {
        System.out.println("Using Iterative Approach");
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr.get(k) + "  ");
                }
                System.out.println();
            }
        }
    }

    // Recursive Approach
    public static void usingRecursion(int arr[], int start, int end) {
        if (end == arr.length) {
            return;
        } else if (start > end) {
            usingRecursion(arr, 0, end + 1);
        } else {
            for (int i = start; i < end; i++) {
                System.out.print(arr[i] + "  ");
            }
            System.out.println(arr[end]);
            usingRecursion(arr, start + 1, end);
        }
        return;
    }

    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println("All Non-empty sub-arrays: ");
        usingIteration(arr);

        int arr2[] = {1,2,3};
        System.out.println("\nUsing Recursion:- ");
        usingRecursion(arr2, 0, 0);
    }
}
