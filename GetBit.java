import java.util.Scanner;

public class GetBit{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = scanner.nextInt();
        System.out.print("Enter your position : ");
        int position = scanner.nextInt();
        int bitMusk = 1 << position;

        if ((bitMusk & number) == 0) {
           System.out.println("Get bit was zero."); 
        }else{
            System.out.println("Get bit was one.");
        }
        scanner.close();
    }
}