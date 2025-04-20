import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        char choose ;

        do {
            System.out.print("Enter the number : ");
            int number = scanner.nextInt();
            if(number > 0){
                positiveCount++;
            }else if(number < 0){
                negativeCount++;
            }else{
                zeroCount++;
            };
            System.out.println("Do you want to enter a number? (y/n)");
            choose = scanner.next().charAt(0);
        }while(choose == 'Y' || choose == 'y');
    
        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);
        System.out.println("Zero numbers count: " + zeroCount);



        scanner.close();
    }
}
