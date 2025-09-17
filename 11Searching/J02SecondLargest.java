import java.util.Arrays;

public class J02SecondLargest {
    // [Naive Approach] Using Sorting
    public static int usingSorting(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            if (arr[i - 1] != arr[i]) {
                return arr[i - 1];
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        System.out.println(usingSorting(arr));
    }
}
