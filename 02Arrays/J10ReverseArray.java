import java.util.ArrayList;

public class J10ReverseArray {
    // [Naive Approach] Using a temporary array – O(n) Time and O(n) Space
    public static void usingTemp(int arr[]) {
        int n = arr.length;
        int temp[] = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i]=arr[n-i-1];
        }

        System.out.println("Using Temporary Array:-");
        for(int x:temp){
            System.out.print(x+"  ");
        }
    }

    public static void main(String args[]) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };
        usingTemp(arr);

    }
}
