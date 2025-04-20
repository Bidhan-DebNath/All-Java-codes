public class QuickSort {
public static int partition(int array[], int low, int high){
    int pivot = array[high];
    int i = low - 1;
    for(int j = low; j < high; j++){
        if(array[j] < pivot){
            i++;
            int temporary = array[i];
            array[i] = array[j];
            array[j] = temporary;
        }
    }
    int temporary = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temporary;
    return i + 1;
};
public static void quickSort(int array[], int low, int high){
    if(low < high){
        int pivotIndex = partition(array, low, high);

        quickSort(array, low, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, high);
    }
};
public static void main(String args[]){
    
    int array[] = {7, 2, 1, 6, 8, 5, 3, 4};
    int arrayLength = array.length;
    quickSort(array, 0, arrayLength - 1);
    for(int number : array){
        System.out.print(number + " ");
    }

};

}
