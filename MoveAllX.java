public class MoveAllX {
    public static void moveAllX(String str, int index, StringBuilder newString, int counter, char chara) {
        if (index == str.length()) {
            // Append all 'chara' occurrences at the end
            for (int i = 0; i < counter; i++) {
                newString.append(chara);
            }
            System.out.println(newString.toString());
            return;
        }

        char current = str.charAt(index);
        if (current == chara) {
            // Count occurrences of 'chara', but don't append yet
            moveAllX(str, index + 1, newString, counter + 1, chara);
        } else {
            // Append current character to result
            newString.append(current);
            moveAllX(str, index + 1, newString, counter, chara);
        }
    }

    public static void main(String[] args) {
        moveAllX("asdsafasdasdasdasada", 0, new StringBuilder(), 0, 'a');
    }
}
