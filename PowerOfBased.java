import java.util.Scanner;
public class PowerOfBased {
    public static int power(int base, int power){
        int result = 1; 
        for(int i = 0; i < power; i++){
            result = result * base;
        }
        return result;
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number : ");
        int base = scanner.nextInt();
        System.out.print("Enter the power : ");
        int power = scanner.nextInt();
        System.out.println("The result is : " + power(base, power));
        scanner.close();
    };
    
}