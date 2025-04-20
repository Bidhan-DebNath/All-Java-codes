import java.util.*;

public class App {
    // Method to find the greater of two numbers
    public static int findGreaterNumber(int numberOne, int numberTwo) {
        if (numberOne > numberTwo) {
            return numberOne;
        } else {
            return numberTwo;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        int numberOne = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int numberTwo = scanner.nextInt();

        // Call the method and print the greater number
        int greaterNumber = findGreaterNumber(numberOne, numberTwo);
        System.out.println("The greater number is: " + greaterNumber);

        // Close the scanner
        scanner.close();
    }
}
