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

    

    public static void main(String args[]) {
        int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
        System.out.println(CheckDuplicateWithinKDistance(arr, 3) ? "Yes" : "No");
        
    }
}