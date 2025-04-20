public class SelectionSort {

    public static void printSort(int[] array){
        System.out.print("Selection sorted array : ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int array[] = {9, 1, 6, 8, 3, 5, 4};
        for(int i = 0; i < array.length - 1; i++){
            int smallest = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[smallest] > array[j]){
                    smallest = j;
                }
            }
            int temporary = array[smallest];
            array[smallest] = array[i];
            array[i] = temporary;
        }
        printSort(array);
    }
    
}