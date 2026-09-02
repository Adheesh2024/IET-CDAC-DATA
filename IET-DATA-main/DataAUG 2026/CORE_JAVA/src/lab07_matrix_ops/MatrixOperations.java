package lab07_matrix_ops;

import java.util.Scanner;

/**
 * Lab 07: 2D Matrix Operations [3][3]
 * Run command: java -cp bin lab07_matrix_ops.MatrixOperations
 */
public class MatrixOperations {
    private static final int ROWS = 3;
    private static final int COLS = 3;
    private static int[][] matrix = new int[ROWS][COLS];
    private static boolean isInitialized = false;

    public static void acceptData(Scanner scanner) {
        System.out.println("\n=== Enter Elements for 3x3 Matrix ===");
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                System.out.print("Enter element at position [" + r + "][" + c + "]: ");
                matrix[r][c] = scanner.nextInt();
            }
        }
        isInitialized = true;
        System.out.println("--> Matrix data initialized successfully!");
    }

    public static void displayData() {
        if (!checkInitialized()) return;
        System.out.println("\n--- 3x3 Matrix Grid ---");
        for (int r = 0; r < ROWS; r++) {
            System.out.print("| ");
            for (int c = 0; c < COLS; c++) {
                System.out.printf("%4d ", matrix[r][c]);
            }
            System.out.println(" |");
        }
        System.out.println("-----------------------");
    }

    public static void displayRowwiseSum() {
        if (!checkInitialized()) return;
        System.out.println("\n--- Row-wise Sum ---");
        for (int r = 0; r < ROWS; r++) {
            int sum = 0;
            for (int c = 0; c < COLS; c++) sum += matrix[r][c];
            System.out.println("Sum of Row " + (r + 1) + " = " + sum);
        }
    }

    public static void displayColumnwiseSum() {
        if (!checkInitialized()) return;
        System.out.println("\n--- Column-wise Sum ---");
        for (int c = 0; c < COLS; c++) {
            int sum = 0;
            for (int r = 0; r < ROWS; r++) sum += matrix[r][c];
            System.out.println("Sum of Column " + (c + 1) + " = " + sum);
        }
    }

    public static void displayMax() {
        if (!checkInitialized()) return;
        int max = matrix[0][0];
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (matrix[r][c] > max) max = matrix[r][c];
            }
        }
        System.out.println("\n--> Overall Maximum Element = " + max);
    }

    public static void displayMin() {
        if (!checkInitialized()) return;
        int min = matrix[0][0];
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (matrix[r][c] < min) min = matrix[r][c];
            }
        }
        System.out.println("\n--> Overall Minimum Element = " + min);
    }

    public static void displayRowwiseMax() {
        if (!checkInitialized()) return;
        System.out.println("\n--- Row-wise Maximum Elements ---");
        for (int r = 0; r < ROWS; r++) {
            int rMax = matrix[r][0];
            for (int c = 1; c < COLS; c++) {
                if (matrix[r][c] > rMax) rMax = matrix[r][c];
            }
            System.out.println("Max in Row " + (r + 1) + " = " + rMax);
        }
    }

    public static void displayColumnwiseMax() {
        if (!checkInitialized()) return;
        System.out.println("\n--- Column-wise Maximum Elements ---");
        for (int c = 0; c < COLS; c++) {
            int cMax = matrix[0][c];
            for (int r = 1; r < ROWS; r++) {
                if (matrix[r][c] > cMax) cMax = matrix[r][c];
            }
            System.out.println("Max in Column " + (c + 1) + " = " + cMax);
        }
    }

    private static boolean checkInitialized() {
        if (!isInitialized) {
            System.out.println("\n[Warning] Matrix has not been populated yet!");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========= 2D MATRIX [3][3] MENU =========");
            System.out.println("1. Accept Data");
            System.out.println("2. Display Data");
            System.out.println("3. Row-wise Sum");
            System.out.println("4. Column-wise Sum");
            System.out.println("5. Display Overall Max");
            System.out.println("6. Display Overall Min");
            System.out.println("7. Display Row-wise Max");
            System.out.println("8. Display Column-wise Max");
            System.out.println("9. Exit");
            System.out.print("Enter choice (1-9): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1: acceptData(scanner); break;
                case 2: displayData(); break;
                case 3: displayRowwiseSum(); break;
                case 4: displayColumnwiseSum(); break;
                case 5: displayMax(); break;
                case 6: displayMin(); break;
                case 7: displayRowwiseMax(); break;
                case 8: displayColumnwiseMax(); break;
                case 9: System.out.println("Exiting Matrix Operations."); break;
                default: System.out.println("Invalid choice!"); break;
            }

        } while (choice != 9);

        scanner.close();
    }
}
