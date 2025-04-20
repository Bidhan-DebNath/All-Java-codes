public class GetOccurrence {
    public static int firstOccurrence = - 1;
    public static int lastOccurrence = - 1;

    public static void getOccurrence(String str, int index, char ch) {
        if (index == str.length()) return; // Base case: Stop when index reaches end

        if (str.charAt(index) == ch) {
            if (firstOccurrence == - 1) firstOccurrence = index; // Set first occurrence only once
            lastOccurrence = index; // Always update last occurrence
        }

        getOccurrence(str, index + 1, ch); // Recursive call moving forward
    }

    public static void main(String[] args) {
        getOccurrence("asdsadfasdgeadda", 0, 'a');
        System.out.println("First Occurrence: " + firstOccurrence);
        System.out.println("Last Occurrence: " + lastOccurrence);
    }
}
