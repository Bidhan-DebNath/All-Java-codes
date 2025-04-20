import java.util.Scanner;

public class SetBit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = scanner.nextInt();
        System.out.print("Enter your position : ");
        int position = scanner.nextInt();

        int bitMask = 1 << position;
        int newNumber = bitMask | number ;

        System.out.println(newNumber);
        scanner.close();
    }
}