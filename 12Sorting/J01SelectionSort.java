import java.util.Arrays;

public class J01SelectionSort {
    public static void SelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String args[]) {
        int[] arr = { 64, 25, 12, 22, 11 };
        System.out.println("Original Array: " + Arrays.toString(arr));

        SelectionSort(arr);

        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
