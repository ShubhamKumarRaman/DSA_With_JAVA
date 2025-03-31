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

    // Juggling Algorithm
    public static void usingJugglingAlgo(int arr[], int d) {
        int n = arr.length;
        d %= n;
        int cycles = findGCD(n, d);
        for (int i = 0; i < cycles; i++) {
            int currentIdx = i;
            int currentEle = arr[currentIdx];
            do {
                int nextIdx = (currentIdx + d) % n;
                int nextEle = arr[nextIdx];

                arr[nextIdx] = currentEle;
                currentEle = nextEle;
                currentIdx = nextIdx;
            } while (currentIdx != i);
        }
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void printArray(int arr[]) {
        for (int x : arr) {
            System.out.print(x + "  ");
        }
        System.out.println();
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

        int[] arr3 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("\nUsing Juggling Algorithm:- ");
        usingJugglingAlgo(arr3, 3);
        printArray(arr3);
    }
}
