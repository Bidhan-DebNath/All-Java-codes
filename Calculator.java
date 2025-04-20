import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Input for the two numbers
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Prompt the user to choose an operation
        System.out.print("Choose an operation: +, -, *, / :");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
            System.out.println("Result: " + (firstNumber + secondNumber));
                break;
            case '-':
            System.out.println("Result: " + (firstNumber - secondNumber));
                break;
            case '*':
            System.out.println("Result: " + (firstNumber * secondNumber));
                break;
            case '/':
                if(secondNumber != 0){
                    System.out.println("Result: " + (firstNumber / (double)secondNumber));
                }else{
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:  System.out.println("Invalid operation. Please choose +, -, *, or /.");
                break;
        }

    }
}
