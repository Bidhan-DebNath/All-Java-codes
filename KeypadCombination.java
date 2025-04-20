public class KeypadCombination {

    public static String[] keypad = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public static void keypadCombination(String str, int index, String current){
        if(index == str.length()){
            System.out.println(current);
            return;
        }
        char characture = str.charAt(index);
        String key = keypad[characture - '0'];
        for(int i = 0; i < key.length(); i++){
            keypadCombination(str, index + 1, current + key.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        keypadCombination(str, 0, "");
    }
}