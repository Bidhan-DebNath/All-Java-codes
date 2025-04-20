public class Movex {
    public static void moveX(String str, int index, char character, int counter, String newString) {
        // Base condition: When the index reaches the end of the string
        if (index == str.length()) {
            // Append all counted occurrences of 'x' at the end
            for (int i = 0; i < counter; i++) {
                newString += character;
            }
            System.out.println(newString);
            return;
        }

        // Current character
        char current = str.charAt(index);

        // If character is 'x', increase the counter
        if (current == character) {
            moveX(str, index + 1, character, counter + 1, newString);
        } else {
            // Append the character to the new string and proceed
            moveX(str, index + 1, character, counter, newString + current);
        }
    }

    public static void main(String[] args) {
        String str = "abcdefssxssxssx";
        moveX(str, 0, 'x', 0, "");
    }
}
