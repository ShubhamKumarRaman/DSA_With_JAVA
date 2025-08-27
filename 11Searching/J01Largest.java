public class J01Largest {
    // Iterative Approach - O(n) Time and O(1) Space
    public static int usingIterative(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    // Recursive Approach - O(n) Time and O(n) Space
    public static int usingRecursive(int[] arr){
        return findMax(arr, 0);
    }
    public static int findMax(int[] arr, int i ){
        if(i==arr.length-1){
            return arr[i];
        }

        return Math.max(arr[i], findMax(arr, i+1));
    }

    public static void main(String args[]) {
        int arr[] = { 10, 324, 45, 990, 98, 8 };

        System.out.println("Using Iterative approach : " + usingIterative(arr));
        System.out.println("Using Recursive approach : "+ usingRecursive(arr));
    }
}
