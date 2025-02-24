import java.util.ArrayList;

public class J05ThreeLargest {
    // Naive Solution – Three Traversals
    public static ArrayList<Integer> UsingThreeTraversal(int arr[]) {
        int first, second, third;
        first = second = third = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > first) {
                third = second;
                second = first;
                first = x;
            } else if (x > second) {
                third = second;
                second = x;
            } else if (x > third) {
                third = x;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        if (first == Integer.MIN_VALUE) {
            return result;
        }
        result.add(first);
        if (second == Integer.MIN_VALUE) {
            return result;
        }
        result.add(second);
        if (third == Integer.MIN_VALUE) {
            return result;
        }
        result.add(third);

        return result;
    }

    public static void main(String args[]) {
        int[] arr = { 12, 13, 1, 10, 34, 1 };
        ArrayList<Integer> result = UsingThreeTraversal(arr);
        System.out.print("Largest elements :- ");
        for (int x : result) {
            System.out.print(x + "  ");
        }
        System.out.println("\n------------------------");
        int[] arr2 = { 10, 10, 10, 10 };
        ArrayList<Integer> result2 = UsingThreeTraversal(arr2);
        System.out.print("Largest elements: ");
        for(int x: result2){
            System.out.print(x+"  ");
        }
    }
}
