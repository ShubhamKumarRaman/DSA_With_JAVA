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

    // [Better Approach] Using Hashing – O(n) Time and O(n) Space
    public static int usingHashing(int arr[]) {
        int n = arr.length + 1;
        int hash[] = new int[n + 1];
        for (int i = 0; i < n - 1; i++) {
            hash[arr[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    // [Expected Approach 1] Using Sum of n terms Formula – O(n) Time and O(1) Space
    public static int usingSum(int arr[]) {
        long n = arr.length + 1;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        long expSum = n * (n + 1) / 2;
        return (int) (expSum - sum);
    }

    // [Expected Approach 2] Using XOR Operation – O(n) Time and O(1) Space
    public static int usingXOR(int arr[]) {
        int n = arr.length + 1;
        int XOR1 = 0, XOR2 = 0;
        for (int i = 0; i < n - 1; i++) {
            XOR2 ^= arr[i];
        }
        for (int i = 1; i <= n; i++) {
            XOR1 ^= i;
        }
        return XOR1 ^ XOR2;
    }

    public static void main(String args[]) {
        int[] arr = { 8, 2, 4, 5, 3, 7, 1 };
        System.out.println("Missing Number: " + usingLinearSearch(arr));
        System.out.println("Missing Number: " + usingHashing(arr));
        System.out.println("Missing Number: " + usingSum(arr));
        System.out.println("Missing Number: " + usingXOR(arr));
    }
}
