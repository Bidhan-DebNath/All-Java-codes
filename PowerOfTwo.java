import java.util.Scanner;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int number){
        return ((number > 0) && (number & (number - 1 )) == 0);
    };

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        System.out.println(number + " is a power of 2 " + isPowerOfTwo(number));
    }
    
}
