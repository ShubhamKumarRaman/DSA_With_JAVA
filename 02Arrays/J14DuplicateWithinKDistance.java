public class J14DuplicateWithinKDistance {
    // [Naive Approach] – O(n * k) Time and O(1) Space
    public static boolean CheckDuplicateWithinKDistance(int arr[], int k) {
        for (int i = 0; i < arr.length - k; i++) {
            for (int j = 1; j <= k; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean checkDuplicatesWithinK2(int[] arr, int k) {
        int n = arr.length;

        // Traverse for every element
        for (int i = 0; i < n; i++) {

            // Traverse next k elements
            for (int c = 1; c <= k && (i + c) < n; c++) {
                int j = i + c;

                // If we find one more occurrence within k
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
        System.out.println(CheckDuplicateWithinKDistance(arr, 3) ? "Yes" : "No");
        int[] arr2 = { 1, 2, 3, 4, 1, 2, 3, 4 };
        System.out.println(checkDuplicatesWithinK2(arr2, 3) ? "Yes" : "No");
    }
}