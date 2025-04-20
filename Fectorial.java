import java.util.*;

public class App {
    public static void main(String[] args) {
        // Create a new instance of the application context
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the factorial number: ");
        int number = scanner.nextInt();
        
        // Call the Factorial method
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
        
        scanner.close();
    }

    // Method to calculate factorial
    public static int factorial(int number) {
        int factorialEnd = 1;

        for (int i = number; i > 0; i--) {
            factorialEnd *= i;
        }

        return factorialEnd;
    }
}
