public class J19MissingNumber {
    // [Naive Approach] Linear Search for Missing Number –
    // O(n^2) Time and O(1) Space
    public static int usingLinearSearch(int arr[]) {
        int n = arr.length;
        for (int i = 1; i <= n + 1; i++) {
            boolean isFound = false;
            for (int j = 0; j < n; j++) {
                if (i == arr[j]) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = { 8, 2, 4, 5, 3, 7, 1 };
        System.out.println("Missing Number: " + usingLinearSearch(arr));
    }
}
