public class BubbleSort {
    public static void printSort(int[]array){
        System.out.print("The bubble sorted number is : ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
public static void main(String[] args){
    int array[] = {7, 9, 6, 8, 5, 4, 2, 3};
    int arrayLength = array.length;
    for(int i = 0; i < arrayLength -1; i++){
        for(int j = 0; j < arrayLength - i - 1; j++){
           if(array[j] > array[j + 1]){
            int temporary = array[j];
            array[j] = array[j + 1];
            array[j+1] = temporary;
           }
        }
    }
    printSort(array);
}
}