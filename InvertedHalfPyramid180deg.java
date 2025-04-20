import java.util.Scanner;
public class InvertedHalfPyramid180deg {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        for(int i = 1; i <= rows; i++){
            int spaces = (rows - i);
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
