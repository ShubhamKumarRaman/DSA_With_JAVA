public class J05ClosestNumber {
    // [Naive Approach] Iterative Checking Time Complexity – O(m) Space Complexity –
    // O(1)
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

    // [Expected Approach] By finding Quotient
    public static int usingFindingQuotient(int num, int div) {
        int q = num / div;

        int n1 = div * q;

        int n2 = (div * q) > 0 ? (div * (q + 1)) : (div * (q - 1));

        if (Math.abs(num - n1) < Math.abs(num - n2)) {
            return n1;
        }
        return n2;
    }

    public static void main(String args[]) {
        int num = 13, div = 4;
        System.out.println(closestNumberIterative(num, div));
        System.out.println(usingFindingQuotient(num, div));
    }
}
