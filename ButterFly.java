
import java.util.Scanner;
public class ButterFly {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row = scanner.nextInt();
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            };

            int spaces = 2 * (row - i);
            for(int k = 1; k <= spaces; k++){
                System.out.print(" ");           
            };

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = row; i >= 1; i--){

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            };
            
            int spaces = 2 * (row - i);
            for(int k = 1; k <= spaces; k++){
                System.out.print(" ");           
            };

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
