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

    // [Better Approach] Two Pass Search
    public static int usingTwoPass(int arr[]) {
        int n = arr.length;
        int largest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        int secondLargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    // [Expected Approach] One Pass Search
    public static int usingOnePass(int[] arr) {
        int largest = -1, secondLargest = -1;

        for (int n : arr) {
            if (n > largest) {
                secondLargest = largest;
                largest = n;
            }
        }

        return secondLargest;
    }

    public static void main(String args[]) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        System.out.println("Using Sorting: " + usingSorting(arr));

        System.out.println("Using Two Pass: " + usingTwoPass(arr));

        System.out.println("Using One Pass: " + usingOnePass(arr));
    }
}
