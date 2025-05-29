public class J04Multiplication {
    public static int[][] Multiplication(int[][] m1, int[][] m2) {
        int r1 = m1.length;
        int c1 = m1[0].length;
        int r2 = m2.length;
        int c2 = m2[0].length;
        int[][] result = new int[r1][c2];

        if (m1[0].length != m2.length) {
            System.out.println("Invalid Input!");
            return result;
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
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
        System.out.println("---------------------------------");
    }

    public static void main(String args[]) {
        int[][] m1 = { { 1, 1 }, { 2, 2 } };
        int[][] m2 = { { 1, 1 }, { 2, 2 } };
        int[][] result = new int[m1.length][m2[0].length];
        result = Multiplication(m1, m2);
        printMatrix(m1);
        printMatrix(m2);
        printMatrix(result);
    }
}
