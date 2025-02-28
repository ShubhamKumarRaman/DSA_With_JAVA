import java.util.ArrayList;

public class J09SubStrings {
    // Iterative Approach
    public static void usingIteration(ArrayList<Integer> arr) {
        System.out.println("Using Iterative Approach");
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr.get(k) + "  ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println("All Non-empty sub-arrays: ");
        usingIteration(arr);
    }
}
