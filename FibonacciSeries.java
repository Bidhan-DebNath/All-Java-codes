import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of terms
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int number = scanner.nextInt();
        if(number <= 0){
            System.out.println("Please enter a positive integer.");
        }else{
            System.out.println("Fibonacci series of " + number + " terms:");
            // Print the Fibonacci series
            printFibonacci(number);
        }
        scanner.close();
    };

    // Method to print Fibonacci series
    public static void printFibonacci(int number){
        int firstNumber = 0;
        int secondNumber = 1;
        for(int i = 0; i < number; i++){
            System.out.print(firstNumber + " ");
            int nextNumeber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumeber;
        };
        System.out.println();
    };
}
