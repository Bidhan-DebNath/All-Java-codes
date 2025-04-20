import java.util.Scanner;

public class NameArray {
    public static String[] namedArray(int lengthOfArray) {
        Scanner scanner = new Scanner(System.in);
        String array[] = new String[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {
            System.out.print("Enter name for position " + (i + 1) + " of the array : ");
            array[i] = scanner.nextLine();
        }
        scanner.close(); // Close the scanner after use
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int lengthOfArray = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character

        if (lengthOfArray <= 0) {
            System.out.println("Array length should be greater than 0");
            scanner.close();
            return;
        }

        String[] names = namedArray(lengthOfArray);
        int nameSize = names.length;

        for (int j = 0; j < nameSize; j++) {
            System.out.println("Name at position " + (j + 1) + " is " + names[j]); 
        }

        scanner.close(); // Close the scanner in main as well
    }
}