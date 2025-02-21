import java.util.Arrays;

public class J03LargestElement {
    public static int findUsingIteration(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int element : arr) {
            if (element > largest) {
                largest = element;
            }
        }
        return largest;
    }

    // Recursive Approach – O(n) Time and O(n) Space
    public static int findUsingRecursion(int arr[], int i){
        if(i==arr.length-1){
            return arr[i];
        }
        return Math.max(arr[i], findUsingRecursion(arr, i+1));
    }

    // Using Library Methods – O(n) Time and O(1) Space
    public static int findUsingLibrary(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static void main(String args[]) {
        int arr[] = { 10, 324, 45, 90, 980, 8 };
        System.out.println("Largest element: " + findUsingIteration(arr));
        System.out.println("Largest element: " + findUsingRecursion(arr, 0));
        System.out.println("Largest element: " + findUsingLibrary(arr));

    }
}
