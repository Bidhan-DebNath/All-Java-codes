import java.util.HashSet;

public class UniqueSubsequencesOfString {

    public static void uniqueSubSequence(String str, int index, String current, HashSet <String> set){
        if(index == str.length()){
            if(set.contains(set)){
                return;
            }else{
                set.add(current);
                System.out.println(current);
                return;
            }
        }
        char character = str.charAt(index);
        uniqueSubSequence(str, index + 1, current + character, set);
        uniqueSubSequence(str, index + 1, current, set);
    }
    public static void main(String[] args){
        uniqueSubSequence("abc", 0, "", new HashSet <String>());
    }
}