public class Pairing {

    public static int pairing(int n){
        if(n <= 0) return 1;
        int wayOne = pairing(n - 1);
        int wayTwo = (n - 1) * pairing(n - 2);
        return wayOne + wayTwo;
    }
    public static void main(String[] args){
        System.out.println("Total ways to pair : " + pairing(4)); // Example: 4 people
    }
}