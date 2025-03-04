public class J11RotateArray {
    public static void rotateOnebyOne(int arr[], int d) {
        int n = arr.length;
        for (int i = 0; i < d; i++) {
            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
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
        rotateOnebyOne(arr, d);
        printArray(arr);
    }
}
