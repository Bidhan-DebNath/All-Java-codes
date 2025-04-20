import java.util.Scanner;

public class HollowButterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Upper half of the hollow butterfly
        for (int i = 1; i <= rows; i++) {
            // Print the left wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Print spaces in the middle
            int spaces = 2 * (rows - i);
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }

            // Print the right wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower half of the hollow butterfly
        for (int i = rows; i >= 1; i--) {
            // Print the left wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Print spaces in the middle
            int spaces = 2 * (rows - i);
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }

            // Print the right wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
