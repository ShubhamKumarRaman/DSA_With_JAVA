import java.util.HashSet;

public class J08RemoveDuplicate {
    // Using Hash Set – Works for Unsorted Also – O(n) Time and O(n) Space
    public static int usingHashSet(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                arr[index++] = arr[i];
            }
        }
        return index;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int newSize = usingHashSet(arr);
        System.out.print("Unique elements:- ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
