import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        // Handle edge cases for numbers less than 2
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check divisors from 2 to sqrt(number)
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // Exit loop early if a divisor is found
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println("The number is a prime number.");
        } else {
            System.out.println("The number is not a prime number.");
        }

        scanner.close();
    }
}
