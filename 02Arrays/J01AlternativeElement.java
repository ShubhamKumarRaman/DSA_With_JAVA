import java.util.ArrayList;

public class J01AlternativeElement {
    // Iterative Approach
    public static ArrayList<Integer> getIteratively(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i += 2) {
            result.add(arr[i]);
        }
        return result;
    }

    // Recursive Approach
    public static ArrayList<Integer> getRecursively(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        getElement(arr, 0, result);
        return result;

    }

    public static void getElement(int arr[], int index, ArrayList<Integer> result) {
        if (index < arr.length) {
            result.add(arr[index]);
            getElement(arr, index + 2, result);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println("First Array:- ");
        ArrayList<Integer> res = getIteratively(arr);
        for (int element : res) {
            System.out.print(element + "  ");
        }

        System.out.println("\nSecond Array:- ");

        int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        res = getRecursively(arr2);
        for (int element : res) {
            System.out.print(element + "  ");
        }
    }
}
