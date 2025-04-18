import java.util.Stack;

public class J05CelebrityProblem {
    // [Better Approach] – Using Stack – O(n) Time and O(n) Space
    public static int usingStack(int[][] matrix) {
        int n = matrix.length;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        while (stack.size() > 1) {
            int i = stack.peek();
            stack.pop();
            int j = stack.peek();
            stack.pop();

            if (matrix[i][j] != 0) {
                stack.push(j);
            } else {
                stack.push(i);
            }
        }

        int celebrity = stack.peek();

        for (int i = 0; i < n; i++) {
            if ((i != celebrity) && (matrix[i][celebrity] == 0 || matrix[celebrity][i] == 1)) {
                return -1;
            }
        }
        return celebrity;
    }

    public static void main(String args[]) {
        int[][] matrix = { { 0, 1, 0 },
                { 0, 0, 0 },
                { 0, 1, 0 } };
        System.out.println("Celebrity: " + usingStack(matrix));
    }
}
