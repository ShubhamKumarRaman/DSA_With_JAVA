import java.util.HashMap;
import java.util.Map;

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

    // Better Approach- Using Hash Map – O(n) Time and O(n) Space
    public static int usingHashMap(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Integer> cnt = new HashMap<>();
        for (int i = 0; i < n; i++) {
            cnt.put(arr[i], cnt.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> p : cnt.entrySet()) {
            if (p.getValue() == 1) {
                return p.getKey();
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = { 2, 3, 5, 4, 5, 2, 4 };
        System.out.println("Single Element: " + SearchSingleElement(arr));
        System.out.println("Using HashMap: "+usingHashMap(arr));
    }
}
