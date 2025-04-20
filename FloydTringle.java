
import java.util.Scanner;
public class FloydTringle {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of print: ");
        int number = scanner.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        scanner.close();
    }
}
