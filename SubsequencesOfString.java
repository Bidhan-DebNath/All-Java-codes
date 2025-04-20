public class SubsequencesOfString {

    public static void subSequence(String str, int index, String currnet){
        if(index == str.length()){
            System.out.println(currnet);
            return;
        }
        char character = str.charAt(index);
        subSequence(str, index + 1, currnet + character);
        subSequence(str, index + 1, currnet);
    }
    public static void main(String[] args){
        subSequence("abc", 0, "");
    }
}