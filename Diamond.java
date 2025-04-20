
import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row = scanner.nextInt();

        for(int i = 1; i <= row; i++){

            int spaces = (row - i);
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");           
            };

            int star = (2 * i - 1);
            for(int k = 1; k <= star; k++){
                System.out.print("*");
            };

            System.out.println();
        }
        for(int i = row; i >= 1; i--){

            int spaces = (row - i);
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");           
            };

            int star = (2 * i - 1);
            for(int k = 1; k <= star; k++){
                System.out.print("*");
            };

            System.out.println();
        }
        scanner.close();
    }
}
