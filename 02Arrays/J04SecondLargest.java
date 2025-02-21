import java.util.Arrays;

public class J04SecondLargest {
    // [Naive Approach] Using Sorting
    public static int usingSorting(int arr[]) {
        System.out.println("Using Sorting:- ");
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        System.out.println("All elements are same......");
        return -1;
    }

    // [Better Approach] Two Pass Search
    public static int usingTwoPass(int arr[]) {
        System.out.println("Using two pass:- ");
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    // [Expected Approach] One Pass Search
    public static int usingOnePass(int arr[]) {
        System.out.println("Using One pass:- ");
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String args[]) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        System.out.println("Second Largest element : " + usingSorting(arr));
        int arr2[] = { 10, 10, 10 };
        System.out.println("Second Largest element : " + usingSorting(arr2));
        System.out.println("Second Largest element : " + usingTwoPass(arr2));
        int[] arr3 = { 12, 35, 1, 10, 34, 1 };
        System.out.println("Second Largest element : " + usingTwoPass(arr3));
        System.out.println("Second Largest element : " + usingOnePass(arr3));

    }
}
