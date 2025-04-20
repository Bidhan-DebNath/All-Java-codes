import java.util.*;

public class App {
    // Method to calculate the sum of all odd numbers from 1 to n
    public static int sumOfOddNumbers(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                sum += i;
            }
        }
        return sum; // Return the calculated sum
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        // Call the method and display the result
        System.out.println("The sum of odd numbers from 1 to " + number + " is: " + sumOfOddNumbers(number));

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
