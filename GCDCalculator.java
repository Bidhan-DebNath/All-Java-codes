import java.util.Scanner;
public class GCDCalculator {
    // GCD calculation using the Euclidean algorithm
    public static int calculateGCD(int numberOne, int numberTwo){
        // Ensuring the inputs are non-negative
        numberOne = Math.abs(numberOne);
        numberTwo = Math.abs(numberTwo);
        // Applying the Euclidean algorithm
        while (numberTwo != 0) { // Loop continues until numberTwo becomes zero
            int tamporary = numberTwo; // Temporarily storing the value of numberTwo
            // Calculating the remainder of numberOne divided by numberTwo
            numberTwo = numberOne % numberTwo;
            // Updating numberOne with the previous value of numberTwo
            numberOne = tamporary;
        }
        // When numberTwo becomes zero, numberOne holds the GCD
        return numberOne;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: "); // Input prompt for the first number
        int numberOne = scanner.nextInt(); // User's input for the first number
        System.out.print("Enter the second number: "); // Input prompt for the second number
        int numberTwo = scanner.nextInt(); // User's input for the second number
        // Printing the GCD of the two numbers
        System.out.println("The GCD of " + numberOne + " and " + numberTwo + " is: " + calculateGCD(numberOne, numberTwo));

        scanner.close(); // Closing the scanner
    }
}
