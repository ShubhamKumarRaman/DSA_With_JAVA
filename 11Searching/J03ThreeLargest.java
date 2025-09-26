import java.util.ArrayList;

public class J03ThreeLargest {

    // Efficient Solution - One Traversal
    public static ArrayList<Integer> getLargest(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > first) {
                third = second;
                second = first;
                first = n;
            } else if (n > second && n != first) {
                third = second;
                second = n;
            } else if (n > third && n != second) {
                third = n;
            }
        }

        if (first == Integer.MIN_VALUE)
            return result;
        result.add(first);
        if (second == Integer.MIN_VALUE)
            return result;
        result.add(second);
        if (third == Integer.MIN_VALUE)
            return result;
        result.add(third);

        return result;
    }

    public static void main(String args[]) {
        int[] arr = { 12, 13, 1, 10, 34, 1 };

        int[] arr2 = { 10, 10, 10, 10, 10, 10, 10 };

        ArrayList<Integer> result = getLargest(arr);
        for (int n : result) {
            System.out.print(n + "  ");
        }
    }
}