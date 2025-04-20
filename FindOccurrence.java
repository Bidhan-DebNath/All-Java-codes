public class FindOccurrence {
    public static int firstOccurrence = -1;
    public static int lastOccurrence = -1;
    
 public static void findOccurrence(String str, char ch, int index){
    if(index == str.length()){
        System.out.println("First Occurrence: " + firstOccurrence);
        System.out.println("Last Occurrence: " + lastOccurrence);
        return;
    }else{
        if(str.charAt(index) == ch){
            if(firstOccurrence == -1){
                firstOccurrence = index;
            }else{
                lastOccurrence = index;}
        }
        findOccurrence(str, ch, index + 1);
    }
 }
    public static void main(String args[]){
        String str = "abcdefghijklmnopaqrstuv";
        findOccurrence(str, 'a', 0);
    }
}
