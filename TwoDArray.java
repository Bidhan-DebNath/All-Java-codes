import java.util.Scanner;

public class TwoDArray {
    // Method to input a 2D array
    public static int[][] inputArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Restrict the size to a maximum of 3x3
        if (rows > 3 || columns > 3) {
            System.out.println("Matrix size exceeds the maximum allowed (3x3). Please try again.");
            scanner.close();
            return null; // Return null if the dimensions are invalid
        }

        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the element for position (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        scanner.close();
        return matrix;
    }

    // Method to output a 2D array
    public static void outputMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("No valid matrix to display.");
            return;
        }

        System.out.println("The matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Input the matrix
        int[][] matrix = inputArray();

        // Output the matrix
        outputMatrix(matrix);
    }
}
