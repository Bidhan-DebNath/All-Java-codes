import java.util.Scanner;

public class UpdateBit {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = scanner.nextInt();
        System.out.print("Enter your position : ");
        int position = scanner.nextInt();
        System.out.print("Enter your option : ");
        int option = scanner.nextInt();
        int bitMask = 1 << position;
        if(option == 1){
            int newNumber = (bitMask & number);
            System.out.println(newNumber);
        }else if(option == 2){
            int newBitMask = ~(bitMask);
            int newNumber = (newBitMask & number);
            System.out.println(newNumber);
        }else{
            System.out.println("Please choose option 1 or 2");
        }
        scanner.close();
}
}