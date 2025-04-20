import java.util.Scanner;

public class CheckArraySorted {
    // Function to get the size of the array from the user
    public static int getArraySize(Scanner scanner) {
        System.out.print("Enter the size of the array: ");
        return scanner.nextInt();
    }

    // Function to get the elements of the array from the user
    public static int[] getArrayElements(Scanner scanner, int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " elements of the array: ");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    // Helper method to check if the array is sorted in ascending order
    public static boolean isSortedAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Function to display the result of whether the array is sorted
    public static void displayResult(boolean isSorted) {
        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size and elements
        int size = getArraySize(scanner);
        int[] numbers = getArrayElements(scanner, size);

        // Check if the array is sorted
        boolean isSorted = isSortedAscending(numbers);

        // Display the result
        displayResult(isSorted);

        scanner.close();
    }
}
