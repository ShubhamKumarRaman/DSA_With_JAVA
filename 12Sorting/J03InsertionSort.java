import java.util.Arrays;

public class J03InsertionSort {
    public static void InsertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        InsertionSort(arr);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }
}
