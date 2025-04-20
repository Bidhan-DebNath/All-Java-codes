import java.util.Scanner;

public class SearchMatrix {

    public static int[][] createMatrix(Scanner scanner) {
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        if (rows <= 0 || columns <= 0) {
            System.out.println("Invalid matrix dimensions. Rows and columns must be positive and more then 0.");
            return null;
        }

        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("No matrix to display.");
            return;
        }

        System.out.println("The matrix is:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void searchMatrix(int[][] matrix, Scanner scanner) {
        if (matrix == null) {
            System.out.println("No matrix to search.");
            return;
        }

        System.out.print("Enter the element to search: ");
        int search = scanner.nextInt();
        boolean found = false;

        System.out.println("Searching for " + search + " in the matrix...");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == search) {
                    System.out.println("Number " + search + " found at position [" + i + "][" + j + "]");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Number " + search + " is not found in the matrix.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matrix Creation:");
        int[][] matrix = createMatrix(scanner);

        System.out.println();
        displayMatrix(matrix);

        System.out.println();
        searchMatrix(matrix, scanner);

        scanner.close();
        System.out.println("\nProgram execution completed.");
    }
}
