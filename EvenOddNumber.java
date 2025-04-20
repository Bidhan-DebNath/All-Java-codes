import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        // Create a new instance of the Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first_number= scanner.nextInt();

        System.out.print("Enter second number : ");
        int second_number= scanner.nextInt();

        if(first_number % 2 == 0){
            System.out.println("First numbers are even");
        }else{
            System.out.println("First numbers are odd");
        }
       if (second_number % 2 == 0) {
         System.out.println("Second numbers are even");
       }else{
        System.out.println("Second numbers are odd");
       }

       if (first_number % 2 == 0 && second_number % 2 == 0) {
        System.out.println("Both numbers are even.");
       }else if(first_number % 2 != 0 && second_number % 2 != 0){
        System.out.println("Both numbers are odd");
       }else{
        System.out.println("The numbers are a mix of odd and even.");
       }
    }
}
