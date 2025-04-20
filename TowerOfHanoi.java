public class TowerOfHanoi {
    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            // Base case: If there is only one disk, move it directly from source to destination
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            return;
        }
        
        // Step 1: Move (n-1) disks from source to auxiliary using destination as an auxiliary rod
        towerOfHanoi(n - 1, source, destination, auxiliary);
        
        // Step 2: Move the nth (largest) disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        
        // Step 3: Move the (n-1) disks from auxiliary to destination using source as an auxiliary rod
        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        towerOfHanoi(n, 'S', 'A', 'D'); // Move disks from S to D using A as an auxiliary 
    }
}
