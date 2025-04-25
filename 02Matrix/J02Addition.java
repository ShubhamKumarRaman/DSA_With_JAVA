public class J02Addition {
    public static void Addition(int mat1[][], int mat2[][]) {
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                mat1[i][j] += mat2[i][j];
            }
        }
    }

    public static void printMatrix(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
    }

    public static void main(String args[]) {
        int[][] A = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 }, { 4, 4, 4 } };
        int[][] B = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 }, { 4, 4, 4 } };
        printMatrix(A);

        printMatrix(B);
        Addition(A, B);
        System.out.println("----------------------------");
        printMatrix(A);
    }
}
