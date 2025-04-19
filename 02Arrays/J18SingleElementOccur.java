public class J18SingleElementOccur {
    // Naive Approach – O(n^2) Time and O(1) Space
    public static int SearchSingleElement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    
    public static void main(String args[]) {
        int[] arr = { 2, 3, 5, 4, 5, 2, 4 };
        System.out.println("Single Element: " + SearchSingleElement(arr));
    }
}
