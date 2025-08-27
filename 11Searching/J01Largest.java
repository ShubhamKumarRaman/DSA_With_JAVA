public class J01Largest {
    // Iterative Approach - O(n) Time and O(1) Space
    public static int usingIterative(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int arr[] = { 10, 324, 45, 90, 98, 8 };

        System.out.println("Using Iterative approach : " + usingIterative(arr));
    }
}
