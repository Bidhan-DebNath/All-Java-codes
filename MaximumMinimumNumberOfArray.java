import java.util.Scanner;

public class MaximumMinimumNumberOfArray {
    public static int[] arraySize(int size){
        Scanner scanner = new Scanner(System.in);
        int numbers[] = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter the " + (i + 1) + " number of array : ");
            numbers[i] = scanner.nextInt();
        };
        scanner.close();
        return numbers;
    };

    public static int findMax(int[] numbers){
        int maximum = Integer.MIN_VALUE;
        for(int number : numbers){
            if(number > maximum){
                maximum = number;
            };
        };
        return maximum;
    };

    public static int findMin(int[] numbers){
        int minimum = Integer.MAX_VALUE;
        for(int number : numbers){
            if(number < minimum){
                minimum = number;
            };
        };
        return minimum;
    };
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        // Take input for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int number[] = arraySize(size);
        int maximum = findMax(number);
        int minimum = findMin(number);
        System.out.println("Maximum number in the array is : " + maximum);
        System.out.println("Minimum number in the array is : " + minimum);
        scanner.close();
    };
};
