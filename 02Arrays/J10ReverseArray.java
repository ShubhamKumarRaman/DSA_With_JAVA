import java.util.ArrayList;

public class J10ReverseArray {
    // [Naive Approach] Using a temporary array – O(n) Time and O(n) Space
    public static void usingTemp(int arr[]) {
        int n = arr.length;
        int temp[] = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - i - 1];
        }

        System.out.println("Using Temporary Array:-");
        for (int x : temp) {
            System.out.print(x + "  ");
        }
    }

    // [Expected Approach – 1] Using Two Pointers – O(n) Time and O(1) Space
    public static void usingTempVeriable(int arr[]) {
        int left = 0, right = arr.length - 1;
        int temp;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }

    public static void main(String args[]) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };
        usingTemp(arr);
        System.out.println("\nUsing Temprory Variable:- ");
        usingTempVeriable(arr);
        for (int x : arr) {
            System.out.print(x + "  ");
        }
    }
}
