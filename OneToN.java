public class OneToN {
    public static void printNumber(int number){
        if(number == 6) return ;
        System.out.print(number + " ");
        printNumber(number + 1);
    }
    public static void main(String[] args){
        printNumber(1);
    }
}
