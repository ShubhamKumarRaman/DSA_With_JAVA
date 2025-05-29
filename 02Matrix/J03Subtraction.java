public class J03Subtraction {
    public static int[][] Subtraction(int[][] m1, int[][] m2) {
        int[][] result = new int[m1.length][m1[0].length];
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            System.out.println("Subtraction is not possible.");
            return result;
        }
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("============================");
    }

    public static void main(String args[]) {
        int[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] m2 = { { 1, 1, 1 }, { 1, 1, 1 } };
        int[][] result = new int[m1.length][m1[0].length];
        printMatrix(m1);
        printMatrix(m2);
        result = Subtraction(m1, m2);
        printMatrix(result);
    }
}
