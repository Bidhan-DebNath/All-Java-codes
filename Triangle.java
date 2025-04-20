
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row = scanner.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
            int number = (i + j);
            if(number % 2 == 0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
            }
            System.out.println();
        }
        scanner.close();
    }
}
