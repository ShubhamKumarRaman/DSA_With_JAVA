import java.util.Arrays;

public class J05SortMatrix {
    public static void SortMatrix(int[][] matrix) {
        int size = matrix.length * matrix[0].length;
        int arr[] = new int[size];
        int idx = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[idx++] = matrix[i][j];
            }
        }
        Arrays.sort(arr);
        idx = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = arr[idx++];
            }
        }
    }

    public static void printMatrix(int[][] matrix){
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }

    public static void main(String args[]) {
        int mat[][] = { { 5, 4, 7 },
                { 1, 3, 8 },
                { 2, 9, 6 } };
        printMatrix(mat);
        SortMatrix(mat);
        printMatrix(mat);
    }
}
