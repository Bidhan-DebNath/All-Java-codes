import java.util.*;

public class App {
    // Static method to calculate the average
    public static int Average(int numberOne, int numberTwo, int numberThree) {
        int sum = numberOne + numberTwo + numberThree;
        int average = sum / 3;
        return average;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the first number: ");
        int numberOne = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int numberTwo = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int numberThree = scanner.nextInt();

        // Call the Average method and print the result
        System.out.println("The average of the three numbers is: " + Average(numberOne, numberTwo, numberThree));

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
