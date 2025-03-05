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

    // [Better Approach] Two Traversals
    public static void usingTwoTraversal(int arr[]) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length) {
            arr[count++] = 0;
        }
    }

    // [Expected Approach] One Traversal
    public static void usingOneTraversal(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
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

        int[] arr2 = { 1, 2, 0, 4, 3, 0, 5, 0 };
        System.out.println("\nUsing Two traversal");
        usingTwoTraversal(arr2);
        printArray(arr2);

        int[] arr3 = { 1, 2, 0, 4, 6, 3, 0, 5, 0 };
        System.out.println("\nUsing one traversal: ");
        usingOneTraversal(arr3);
        printArray(arr3);

    }
}
