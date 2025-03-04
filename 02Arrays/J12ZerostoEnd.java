public class J12ZerostoEnd {
    // [Naive Approach] Using Temporary Array – O(n) Time and O(n) Space
    public static void usingTemporaryArray(int arr[]) {
        int index = 0;
        int n = arr.length;
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[index++] = arr[i];
            }
        }

        while (index < n) {
            temp[index++] = 0;
        }

        // Copy all elements to old array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + "  ");
        }
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
        System.out.println("Using Temporary array: ");
        usingTemporaryArray(arr);
        printArray(arr);
    }
}
