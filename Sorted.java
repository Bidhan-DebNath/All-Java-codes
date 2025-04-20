public class Sorted {
    public static boolean isSorted(int array[], int index){
        if(array.length - 1 == index) return true;
        if(array[index] < array[index + 1]){
            return isSorted(array, index + 1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        System.out.println(isSorted(array, 0));
    }
}
