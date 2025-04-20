import java.util.Scanner;

public class GradeMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.print("Enter the marks of the student: ");
            int marks = scanner.nextInt();

            // Correcting the ranges for the marks
            if (marks >= 80 && marks <= 100) {
                System.out.println("This is a good result.");
            } else if (marks >= 60 && marks < 80) {
                System.out.println("This is an average result.");
            } else if (marks >= 40 && marks < 60) {
                System.out.println("This is a poor result.");
            } else {
                System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
            }

            // Prompt to continue or exit
            System.out.print("Want to continue? (yes(1) or no(0)): ");
            input = scanner.nextInt();

        } while (input == 1);

        scanner.close();
    }
}
