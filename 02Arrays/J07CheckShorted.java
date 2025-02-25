public class J07CheckShorted {
    // Iterative approach – O(n) Time and O(1) Space
    public static boolean CheckShortedIterative(int arr[]) {
        if (arr.length == 0 || arr.length == 1) {
            return true;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    // Recursive approach – O(n) Time and O(n) Space
    public static boolean CheckShortedRecursive(int arr[], int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        return (arr[n - 1] >= arr[n - 2]) && CheckShortedRecursive(arr, n - 1);
    }

    public static void main(String args[]) {
        int arr[] = { 20, 23, 23, 45, 78, 88 };
        System.out.println("arr:- " + CheckShortedIterative(arr));
        System.out.println("arr:- " + CheckShortedRecursive(arr, arr.length));
        int arr2[] = { 20, 20, 78, 98, 99, 97 };
        System.out.println("arr2:- " + CheckShortedIterative(arr2));
        System.out.println("arr2:- " + CheckShortedRecursive(arr2, arr2.length));
    }
}
