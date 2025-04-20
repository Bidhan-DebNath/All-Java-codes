import java.util.Scanner;

public class ArraySize {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int numberOfSize = scanner.nextInt();

        // Create an array with the specified size
        int array[] = new int[numberOfSize];
        int arrayLength = array.length;

        // Fill the array with elements provided by the user
        for(int i = 0; i < arrayLength; i++){
            System.out.print("Enter the element at index " + i + ": ");
            array[i] = scanner.nextInt();
        };
        
        // Print the array elements
        for(int j = 0; j < arrayLength; j++){
            System.out.println("Element at index " + j + ": " + array[j]);
        }

        scanner.close();
    }
}
