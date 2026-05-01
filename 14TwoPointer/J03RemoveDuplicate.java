import java.util.Arrays;

public class J03RemoveDuplicate {
    // my-approach Using Two pointer approach
    public static int usingTwoPointer(int[] arr) {
        int idx = 1;
        int n = arr.length;
        if (n == 0) {
            return -1;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[idx]) {
                arr[++idx] = arr[i];
            }
        }
        return idx+1;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int idx = usingTwoPointer(arr);
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
