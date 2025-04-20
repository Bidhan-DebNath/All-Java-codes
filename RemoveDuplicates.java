public class RemoveDuplicates {

    public static boolean[] map = new boolean[26];
    public static void removeDuplicate(String str, int index, String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        char character = str.charAt(index);
        if(map[character - 'a']){
            removeDuplicate(str, index + 1, newString);
        }else{
            map[character - 'a'] = true;
            removeDuplicate(str, index + 1, newString + character);
        }
       
    } 
    public static void main(String[] args){
            removeDuplicate("asdasdfasdacasdasfas", 0, "");
        }
}