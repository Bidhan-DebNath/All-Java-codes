import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your last number : ");
        int num2 = scanner.nextInt();

        int sum = 0 ;
        for (int i = 1; i <= num2; i++) {
           sum = sum + i;
        }
        
        System.out.println("The sum of number is : " + sum);
    }
}
