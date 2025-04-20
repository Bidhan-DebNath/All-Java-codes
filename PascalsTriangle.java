import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            // Print leading spaces for formatting
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            
            // Calculate and print each value in the row
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Update the value using nCr formula
            }
            System.out.println();
        }

        scanner.close();
    }
}
