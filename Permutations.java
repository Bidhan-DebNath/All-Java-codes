public class Permutations{
    public static void permutations(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char current = str.charAt(i);
            String before = str.substring(0, i) + str.substring(i + 1);
            permutations(before, permutation + current);
        }
    }
    public static void main(String[] args) permutations("abc", "");
}