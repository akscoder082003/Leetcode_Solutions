/*
 * PROBLEM: 867 : Transpose Matrix
 */
public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        // rows in the matrix.
        int rows = matrix.length;
        // columns in the matrix.
        int columns = matrix[0].length;
        // result matrix will store the transpose of the given matrix.
        int[][] output = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                output[j][i] = matrix[i][j];
            }
        }
        return output;
    }
}
