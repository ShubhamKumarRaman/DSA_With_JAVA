public class J02MinCostArray {
    public static int minCost(int[] arr) {
        int min = arr[0];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return (n - 1) * min;
    }

    public static void main(String args[]) {
        int[] a = { 4, 3, 2 };

        System.out.println("Cost:" + minCost(a));
    }
}
