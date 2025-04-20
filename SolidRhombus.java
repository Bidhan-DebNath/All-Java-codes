
import java.util.Scanner;
public class SolidRhombus {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row = scanner.nextInt();
        for(int i = 1; i <= row; i++){

            int spaces = (row - i);
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");           
            };

            for(int k = 1; k <= row; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
