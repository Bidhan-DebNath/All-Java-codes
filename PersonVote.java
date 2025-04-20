import java.util.Scanner;
public class PersonVote {
    public static String personVote(int age){
        if (age >= 18 ) {
            return "You are eligible to vote";
        }else{
            return "You are not eligible to vote";
        }
    };
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        System.out.println(personVote(age));
        scanner.close();
    }
}
