public class J02LinearSearch {
    public static int LinearSearch(int arr[], int key) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        System.out.println("Key not found");
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        System.out.println("Key is found at index: " + LinearSearch(arr, 10));
        System.out.println("---------------------");
        System.out.println("Key is found at index: " + LinearSearch(arr, 13));
    }
}
