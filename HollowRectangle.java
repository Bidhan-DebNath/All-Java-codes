import java.util.Scanner;
public class HollowRectangle {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of row : ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of column : ");
        int column = scanner.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                if(i == 1 || i == row || j == 1 || j == column){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
