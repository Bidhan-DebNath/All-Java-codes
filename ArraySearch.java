import java.util.Scanner;
public class ArraySearch {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        int arrayLength = array.length;
        for(int i = 0; i < arrayLength; i++){
            System.out.print("Enter element " + i + " of the array: ");
            array[i] = scanner.nextInt();
        };
        System.out.print("Enter the element to search for : ");
        int searchElement = scanner.nextInt();

        for(int j = 0; j < arrayLength; j++){
            if(array[j] == searchElement){
                System.out.println("Element found at index : " + j);
            }
        }
        scanner.close();
    }
}
