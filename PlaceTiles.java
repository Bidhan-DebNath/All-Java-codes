public class PlaceTiles {

    public static int placeTiles(int n, int m){
        if(n == m) return 2;
        if(n < m) return 1;
        return placeTiles(n - 1, m) + placeTiles(n - m, m);
    }
    public static void main(String[] args){
        System.out.println("Total ways to place tiles : " + placeTiles(5, 2)); // Example: 5x2 grid
    }
}