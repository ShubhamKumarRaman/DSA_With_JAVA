import java.util.ArrayList;

public class J10ReverseArray {
    // [Naive Approach] Using a temporary array – O(n) Time and O(n) Space
    public static void usingTemp(int arr[]) {
        int n = arr.length;
        int temp[] = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - i - 1];
        }

        System.out.println("Using Temporary Array:-");
        for (int x : temp) {
            System.out.print(x + "  ");
        }
    }

    // [Expected Approach – 1] Using Two Pointers – O(n) Time and O(1) Space
    public static void usingTempVeriable(int arr[]) {
        int left = 0, right = arr.length - 1;
        int temp;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }

    // [Expected Approach – 2] By Swapping Elements – O(n) Time and O(1) Space
    public static void usingSwappingElement(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }

    public static void printArray(int arr[]){
        for(int x: arr){
            System.out.print(x+"  ");
        }
    }
    public static void main(String args[]) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };
        usingTemp(arr);
        System.out.println("\nUsing Temprory Variable:- ");
        usingTempVeriable(arr);
        for (int x : arr) {
            System.out.print(x + "  ");
        }

        int arr2[] =  {4, 5, 1, 2};
        usingSwappingElement(arr2);
        System.out.println ("\nUsing Swapping Elements:- ");
        printArray(arr2);
    }
}
