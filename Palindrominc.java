
import java.util.Scanner;
public class Palindrominc {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row = scanner.nextInt();

        for(int i = 1; i <= row; i++){

            int spaces = (row - i);
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");           
            };

            for(int k = i; k >= 1; k--){
                System.out.print(k);
            }
            for(int l = 2; l <= i; l++){
                System.out.print(l);
            }
            System.out.println();
        }
        scanner.close();
    }
}
