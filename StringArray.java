import java.util.Scanner;

public class StringArray {

    public static int getSize(Scanner scanner) {
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()
        return size;
    }

    public static String[] getNames(Scanner scanner, int size) {
        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter name at index " + i + ": ");
            names[i] = scanner.nextLine();
        }

        return names;
    }

    public static void printNames(String[] names) {
        for (int j = 0; j < names.length; j++) {
            System.out.println("The name at index " + j + " is " + names[j]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = getSize(scanner);
        if (arraySize <= 0) {
            System.out.println("Invalid size. The array must have at least one element.");
        } else {
            String[] names = getNames(scanner, arraySize);
            printNames(names);
        }

        scanner.close();
    }
}
