import java.util.Scanner;

public class ClearBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = scanner.nextInt();
        System.out.print("Enter your position : ");
        int position = scanner.nextInt();
        int bitMask = 1 << position;
        int newBitMask = ~(bitMask);
        int newNumber = (newBitMask & number);
        System.out.println(newNumber);
        scanner.close();
    }
    
}