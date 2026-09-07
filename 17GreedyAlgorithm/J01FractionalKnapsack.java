import java.util.Arrays;
import java.util.Comparator;

public class J01FractionalKnapsack {
    static class ItemComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] a, int[] b) {
            double a1 = (1.0 * a[0]) / a[1];
            double b1 = (1.0 * b[0]) / b[1];

            return Double.compare(b1, a1);
        }
    }

    static double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n = val.length;

        int[][] items = new int[n][2];

        for (int i = 0; i < n; i++) {
            items[i][0] = val[i];
            items[i][1] = wt[i];
        }

        Arrays.sort(items, new ItemComparator());

        double res = 0.0;
        int currentCapacity = capacity;

        for (int i = 0; i < n; i++) {
            if (items[i][1] <= currentCapacity) {
                res += items[i][0];
                currentCapacity -= items[i][1];
            } else {
                res += (1.0 * items[i][0] / items[i][1]) * currentCapacity;
                break;
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int[] val = { 60, 100, 120 };
        int[] wt = { 10, 20, 30 };
        int capacity = 50;

        System.out.println(fractionalKnapsack(val, wt, capacity));
    }
}
