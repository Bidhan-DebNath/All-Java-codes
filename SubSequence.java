public class SubSequence {
    public static void subSequence(String str, int index, String newString){
        if(str.length() == index){
            System.out.println(newString);
            return;
        }
        char character = str.charAt(index);
        subSequence(str, index + 1, newString + character);
        subSequence(str, index + 1, newString);
    }
    public static void main(String[] args){
        subSequence("abc", 0, "");
    }
}
