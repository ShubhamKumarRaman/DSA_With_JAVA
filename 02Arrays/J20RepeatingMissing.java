import java.util.ArrayList;

public class J20RepeatingMissing {
    // Using Visited Array - O(n) time and O(n) space
    public static ArrayList<Integer> usingVisitedArray(int[] arr) {
        int n = arr.length;
        int missing = -1;
        int repeating = -1;
        int freq[] = new int[n + 1];
        // Calculate frequencies of each elements of an array
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) {
                missing = i;
            }
            if (freq[i] == 2) {
                repeating = i;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
    }

    // [Approach 2] Using Array Marking - O(n) Time and O(1) Space
    public static ArrayList<Integer> usingArrayMarking(int[] arr) {
        int n = arr.length;
        int repeating = -1;

        for (int i = 0; i < n; i++) {
            int val = Math.abs(arr[i]);

            if (arr[val - 1] > 0) {
                arr[val - 1] = -arr[val - 1];
            } else {
                repeating = val;
            }
        }

        int missing = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);

        return result;
    }

    public static void main(String args[]) {
        int[] arr = { 3, 1, 3 };
        ArrayList<Integer> ans = usingVisitedArray(arr);
        System.out.println("Repeating:- " + ans.get(0) + " " + "Missing:- " + ans.get(1));
        int[] arr2 = { 4, 3, 6, 2, 1, 1 };
        ans = usingArrayMarking(arr2);
        System.out.println("Repeating:- " + ans.get(0) + " " + "Missing:- " + ans.get(1));
    }
}
