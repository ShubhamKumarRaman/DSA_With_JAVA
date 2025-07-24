public class J21OnlyRepeating {
    // [Naive Approach] Using Nested Loop- O(n^2) Time and O(1) Space
    public static int usingNestedLoop(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 3, 2, 3, 4 };
        System.out.println("Repeating Number: " + usingNestedLoop(arr));
    }
}
