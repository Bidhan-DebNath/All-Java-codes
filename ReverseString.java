public class ReverseString {

    public static void reverseString(String str, int index, String newString) {
        if (index < 0) { 
            System.out.println( "The reverse string is : " + newString);
            return;
        }

        reverseString(str, index - 1, newString + str.charAt(index));
    }

    public static void main(String[] args) {
        String str = "Bidhan";
        reverseString(str, str.length() - 1, "");
    }
}
