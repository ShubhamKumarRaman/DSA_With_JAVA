public class J11RotateArray {

    // Rotate One by One
    public static void rotateOnebyOne(int arr[], int d) {
        int n = arr.length;
        d %= n;
        for (int i = 0; i < d; i++) {
            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
    }

    // Using temporary array
    public static void usingTemporaryArray(int arr[], int d) {
        int n = arr.length;
        d %= n;
        int temp[] = new int[n];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[n - d + i];
        }
        for (int i = 0; i < n - d; i++) {
            temp[d + i] = arr[i];
        }

        // changing into original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void printArray(int arr[]) {
        for (int x : arr) {
            System.out.print(x + "  ");
        }
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 2;
        System.out.println("Using One by one rotating approach:- ");
        rotateOnebyOne(arr, d);
        printArray(arr);

        int[] arr2 = { 1, 2, 3, 4, 5 };
        System.out.println("\nUsing temprory array:-");
        usingTemporaryArray(arr2, d);
        printArray(arr2);
    }
}
