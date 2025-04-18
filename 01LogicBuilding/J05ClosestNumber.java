public class J05ClosestNumber {
    // [Naive Approach] Iterative Checking Time Complexity – O(m) Space Complexity – O(1)
    public static int closestNumberIterative(int num, int div) {
        int closest = 0;
        int minDifference = Integer.MAX_VALUE;

        for (int i = num - Math.abs(div); i <= num + Math.abs(div); ++i) {
            if (i % div == 0) {
                int difference = Math.abs(num - i);

                if (difference < minDifference ||
                        (difference == minDifference && Math.abs(i) > Math.abs(closest))) {
                    closest = i;
                    minDifference = difference;
                }
            }
        }
        return closest;
    }

    public static void main(String args[]) {
        int num = 13, div = 4;
        System.out.println(closestNumberIterative(num, div));
    }
}
