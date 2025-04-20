import java.util.Scanner;
public class HollowRhombus {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for(int i = 1; i <= rows; i++){
            int space = (rows - i);

            for(int j = 1; j <= space; j++){
                System.out.print(" ");  
            };
            
            for(int k = 1; k <= rows; k++){
                if(i ==1 || i == rows || k == 1 || k == rows){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                };
            };

            System.out.println();
        };
        scanner.close();
    }
    
}
