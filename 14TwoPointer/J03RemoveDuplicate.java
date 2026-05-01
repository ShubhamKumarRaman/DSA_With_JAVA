import java.util.Arrays;
import java.util.HashSet;

public class J03RemoveDuplicate {
    // my-approach Using Two pointer approach
    public static int usingTwoPointer(int[] arr) {
        int idx = 1;
        int n = arr.length;
        if (n == 0) {
            return -1;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[idx]) {
                arr[++idx] = arr[i];
            }
        }
        return idx + 1;
    }

    // Using Hash Set - Works for Unsorted Also - O(n) Time and O(n) Space
    public static int usingHashing(int[] arr) {
        int n = arr.length;
        int idx = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if(!set.contains(arr[i])){
                arr[idx++] = arr[i];
                set.add(arr[i]);
            }
        }
        return idx;
    }

    // Expected Approach - O(n) Time and O(1) Space
    public static int usingTwoPointer2(int[] arr){
        int n = arr.length;
        if (n <= 1)
            return n;
		
        int idx = 1; 
      
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }
    public static void main(String args[]) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int idx = usingTwoPointer(arr);
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        int[] arr2 = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        idx = usingHashing(arr2);
        for(int i = 0;i<idx;i++){
            System.out.print(arr2[i]+"  ");
        }
        System.out.println();

        int[] arr3 = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        idx = usingTwoPointer2(arr3);
        for(int i = 0;i<idx;i++){
            System.out.print(arr3[i]+"  ");
        }
        System.out.println();
    }
}
