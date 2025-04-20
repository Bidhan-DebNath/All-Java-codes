public class SumNumberOfN {
    public static void sumNumber(int initialNumber, int finalNumber, int summation){
        
         summation += initialNumber;
        if(initialNumber == finalNumber){
            System.out.println("The number of sum is : " + summation);
            return;
        }
        sumNumber(initialNumber + 1, finalNumber, summation);
        System.out.print(initialNumber + " ");

    }
    public static void main(String[] args){
        sumNumber(1, 10, 0);
    }
}
