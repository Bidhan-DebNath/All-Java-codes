import java.util.Scanner;

public class MatrixMath {

    public static int[][] createMatrix(Scanner scanner) {
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        if (rows <= 0 || columns <= 0) {
            System.out.println("Invalid input. Please enter positive integers greater than 0.");
            return null;
        }

        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Matrix is null. Nothing to print.");
            return;
        }

        System.out.println("The matrix is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void searchMatrix(int[][] matrix, Scanner scanner) {
        if (matrix == null) {
            System.out.println("Matrix is null. Cannot search.");
            return;
        }

        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("The element " + target + " was found at position [" + i + "][" + j + "]");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("The element " + target + " was not found in the matrix.");
        }
    }

    public static void matrixSolution(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Matrix is null. Cannot perform matrix solution.");
            return;
        }

        // Placeholder logic for solution, as the intended calculation isn't clear.
        System.out.println("Performing a placeholder matrix operation:");

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("The sum of all elements in the matrix is: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Create a matrix:");
        int[][] matrix = createMatrix(scanner);

        System.out.println();
        printMatrix(matrix);

        System.out.println("\nSearch for an element in the matrix:");
        searchMatrix(matrix, scanner);

        System.out.println("\nMatrix solution:");
        matrixSolution(matrix);

        scanner.close();
        System.out.println("\nThe code executed successfully.");
    }
}
