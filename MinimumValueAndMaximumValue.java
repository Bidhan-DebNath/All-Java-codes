import java.util.*;

public class MinimumValueAndMaximumValue {

    // Method to populate the array and find the minimum and maximum values
    public static void findMinAndMax(int arraySize) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[arraySize];
        System.out.println("Enter " + arraySize + " integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // Initialize min and max with the first element
        int min = array[0];
        int max = array[0];

        // Loop through the array to find min and max
        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int sizeArray = scanner.nextInt();

        // Call the method to find min and max
        findMinAndMax(sizeArray);

        scanner.close();
    }
}
