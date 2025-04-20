import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Print the number `i`, decreasing the number of columns for each row
            for (int j = i; j <= rows; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        scanner.close();
    }
}
