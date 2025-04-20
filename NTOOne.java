
public class NTOOne {
    public static void printNumber(int number){
        if(number == 0) {return;}
        System.out.print(" " + number + " ");
        printNumber(number - 1);
    }
    public static void main(String[] args) throws Exception {
        int number = 5;
        printNumber(number);
    }
}
