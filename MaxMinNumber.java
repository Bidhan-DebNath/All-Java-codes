import java.util.*;
public class MaxMinNumber {
    // Function to take array input from the user
    public static int[] inputArray(int size){
        Scanner scanner = new Scanner(System.in);
        int numbers[] = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter the " + (i + 1) + " elements of the array:");
            numbers[i] = scanner.nextInt();
        };
        scanner.close();
        return numbers;

    };
    // Function to find the maximum number in the array
    public static int findMax(int[] numbers){
        int maximumValue = Integer.MIN_VALUE;
        for(int number : numbers){
            if(number > maximumValue){
                maximumValue = number;
            };
        };
        return maximumValue;
    };
    // Function to find the minimum number in the array
    public static int findMin(int[]numbers){
        int minimumValue = Integer.MAX_VALUE;
        for(int number : numbers){
            if(number < minimumValue){
                minimumValue = number;
            };
        };
        return minimumValue;
    }

    public static void main(String[] args){
 // Take input for the size of the array
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the size of the array:");
 int size = scanner.nextInt();
 int numbers[] = inputArray(size);
  // Find maximum and minimum
  int max = findMax(numbers);
  int min = findMin(numbers);
  // Print the maximum and minimum
  System.out.println("Maximum number in the array: " + max);
  System.out.println("Minimum number in the array: " + min);
  
 scanner.close();
    }
}
