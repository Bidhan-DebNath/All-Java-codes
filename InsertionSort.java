public class InsertionSort {
    public static void printSort(int[] array){
        System.out.print("Insertion sorted array is : ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int array[] = {7, 8, 3, 1, 2};

        for(int i = 1; i < array.length; i++){
            int currentIndex = array[i];
            int j = (i -1);
            while((j >= 0) && (currentIndex < array[j])){
                array[j + 1]  = array[j];
                j--;
            }
            array[j + 1] = currentIndex;
        }
        printSort(array);
    }
}