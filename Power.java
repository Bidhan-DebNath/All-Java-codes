public class Power {
    public static int powerOfX(int x, int n){
        if(x == 0) return 0;
        if(n == 0) return 1;
        return x * powerOfX(x, n - 1);
    }
    public static void main(String args[]){
        System.out.println("The power of is " + powerOfX(2, 5));
    }
}
