public class CountPath {
    public static int countPath(int i, int j, int m, int n) {
        if (i >= n || j >= m) return 0; // Out of bounds check
        if (i == n - 1 && j == m - 1) return 1; // Reached destination
        return countPath(i + 1, j, m, n) + countPath(i, j + 1, m, n);
    }

    public static void main(String[] args) {
        System.out.println("Total paths : " + countPath(0, 0, 3, 3)); // Example: 3x3 grid
    }
}