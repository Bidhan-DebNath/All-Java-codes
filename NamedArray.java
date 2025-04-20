import java.util.Scanner;

public class NamedArray {
    public static int arrayLength(int lengthOfArray) {
        int array[] = new int[lengthOfArray]; // Creates an integer array of the specified length
        int arraySize = array.length; // Gets the actual length of the created array
        return arraySize;
    }

    public static String[] nameArray(int names) {
        Scanner scanner = new Scanner(System.in);
        String[] nameArray = new String[names]; // Creates a string array to store names
        for (int i = 0; i < nameArray.length; i++) { // Iterates through the array elements
            System.out.print("Enter name " + (i + 1) + ": "); // Prompts user for each name
            nameArray[i] = scanner.nextLine(); // Reads the entered name and stores it in the array
        }
        scanner.close(); // Closes the Scanner object
        return nameArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();

        if (arraySize <= 0) {
            System.out.println("Array size should be greater than 0.");
        } else {
            arrayLength(arraySize); // Calls the method (return value not used here)
            String[] namesArray = nameArray(arraySize); // Gets an array of names from the user
            for (int j = 0; j < namesArray.length; j++) {
                System.out.println("Name " + (j + 1) + " is :" + namesArray[j]);
            }
        }
        scanner.close(); // Closes the Scanner object (already closed in nameArray)
    }
}