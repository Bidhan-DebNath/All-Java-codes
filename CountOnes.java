public class CountOnes {
    public static int countOnes(int number){
        int count = 0;
        while (number > 0) {
            count += (number & 1);
            number >>= 1;
            
        }
        return count;
    }
    public static void main(String[] args){
        int number = 7;
        System.out.println("Number of 1s in binary " + countOnes(number));
    }
}
