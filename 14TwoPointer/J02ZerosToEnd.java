import java.util.Arrays;

public class J02ZerosToEnd {
    // [Naive Approach] Using Temporary Array - O(n) Time and O(n) Space
    public static void usingTempArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        while (j < n) {
            temp[j++] = 0;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    // [Better Approach] Two Traversals-O(n) Time and O(1) space
    public static void usingTwoTraversal(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        while (j < n) {
            arr[j++] = 0;
        }
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
        usingTempArray(arr);

        System.out.println(Arrays.toString(arr));

        int[] arr2 = { 1, 2, 0, 4, 3, 0, 5, 0 };
        usingTwoTraversal(arr2);
        System.out.println(Arrays.toString(arr2));

    }
}
