
import java.util.Scanner;
public class InvertedHalfPyramidNumber {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row = scanner.nextInt();

        for(int i = 1; i <= row; i++){
            int number = (row - i + 1);
            for(int j = 1; j <= row - i + 1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}
