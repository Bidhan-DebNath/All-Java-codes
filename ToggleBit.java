public class ToggleBit {
    public static int toggleBit(int number, int position){
        return number ^ (1 << position);
    }
    public static void main(String[] args){
        int number = 5; 
        int position = 1;
        int result = toggleBit(number, position);
        System.out.println("Number after toggling position " + position + " : " + result);
    }
}
