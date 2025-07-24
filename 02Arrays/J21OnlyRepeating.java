import java.util.Arrays;
import java.util.HashSet;

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

    // [Better Approach 1] Sorting - O(n Log n) Time and O(1) Space
    public static int usingSorting(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    // [Better Approach 2] Hash Set - O(n) Time and O(n) Space
    public static int usingHashSet(int arr[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : arr) {
            if (set.contains(n)) {
                return n;
            }
            set.add(n);
        }
        return -1;
    }

    // [Expected Approach 1] Sum Formula - O(n) Time and O(1) Space
    public static int usingSumFormula(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int expectedSum = (n - 1) * (n - 1 + 1) / 2;
        return (sum - expectedSum);
    }

    // [Expected Approach 2] Using XOR - O(n) Time and O(1) Space
    public static int usingXOR(int arr[]) {
        int result = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            result = result ^ (i + 1) ^ arr[i];
        }

        result ^= arr[n - 1];

        return result;
    }

    // [Expected Approach 3] Using Elements as Indexes - O(n) Time and O(1) Space
    public static int usingElementIndex(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[Math.abs(arr[i])] < 0) {
                return Math.abs(arr[i]);
            }
            arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
        }

        return -1;
    }

    // [Expected Approach 4] Floyd's Cycle Detection - O(n) Time and O(1) Space
    public static int usingFloydCycle(int arr[]) {
        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        fast = arr[0];

        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 3, 2, 3, 4 };
        System.out.println("Repeating Number: " + usingNestedLoop(arr));
        System.out.println("Repeating Number: " + usingSorting(arr));
        System.out.println("Repeating Number: " + usingHashSet(arr));
        int[] arr2 = { 1, 5, 1, 2, 3, 4 };
        System.out.println("Repeating Number: " + usingSumFormula(arr2));
        System.out.println("Repeating Number: " + usingXOR(arr2));
        System.out.println("Repeating Number: " + usingElementIndex(arr2));
        System.out.println("Repeating Number: " + usingFloydCycle(arr2));
    }
}
