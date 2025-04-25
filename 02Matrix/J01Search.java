public class J01Search {
    // Time Complexity : O(n * m) Auxiliary Space : O(1)
    public static boolean Search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (key == matrix[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int[][] mat = { { 1, 5, 9, 11 },
                { 14, 20, 21, 26 },
                { 30, 34, 43, 50 } };
        System.out.println("Key found: " + Search(mat, 20));
        System.out.println("Key found: " + Search(mat, 100));
    }
}
