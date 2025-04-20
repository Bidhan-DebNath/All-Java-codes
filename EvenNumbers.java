import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int numbers = scanner.nextInt();

        for (int i = 0; i <= numbers; i++) {
            // Directly print the result of the ternary operator
            System.out.println(i % 2 == 0 ? "The even number is: " + i : "The number is not even");
        }

        scanner.close();
    }
}
