package lab09_matrix_add;

import java.util.Scanner;

/**
 * ============================================================================
 * LAB 09: CREATION AND ADDITION OF TWO 2D ARRAYS
 * ============================================================================
 * Add-on Relationship:
 *  - BUILDS UPON LAB 07 (2D Array concept).
 *  - Extends single 2D array manipulation to handling TWO 2D arrays and
 *    computing Matrix Addition: C[i][j] = A[i][j] + B[i][j].
 *
 * Eclipse Run Command: Right-click -> Run As -> Java Application
 * Command Line Run: java -cp bin lab09_matrix_add.MatrixAddition
 * ============================================================================
 */
public class MatrixAddition {

    public static void displayMatrix(String title, int[][] matrix) {
        System.out.println("\n--- " + title + " ---");
        for (int r = 0; r < matrix.length; r++) {
            System.out.print("| ");
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.printf("%4d ", matrix[r][c]);
            }
            System.out.println(" |");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("            2D MATRIX ADDITION PROGRAM            ");
        System.out.println("==================================================");

        System.out.print("Enter number of rows    : ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns : ");
        int cols = scanner.nextInt();

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        int[][] resultMatrix = new int[rows][cols];

        System.out.println("\n=== Enter Elements for Matrix A (" + rows + "x" + cols + ") ===");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("MatrixA [" + i + "][" + j + "]: ");
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n=== Enter Elements for Matrix B (" + rows + "x" + cols + ") ===");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("MatrixB [" + i + "][" + j + "]: ");
                matrixB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        displayMatrix("Matrix A", matrixA);
        displayMatrix("Matrix B", matrixB);
        displayMatrix("Result Matrix (A + B)", resultMatrix);

        System.out.println("==================================================");
        scanner.close();
    }
}
