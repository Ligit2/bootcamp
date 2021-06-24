package week3.day5;
//We are using two nested loops to sort the array, so Time complexity is O(n ^ 2).
//We are using constant space, so Space complexity is O(1).
//As we are calling the function recursively for (n – 1) elements,
// It will be stored in the call stack, so Space complexity is O(n).
public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {4,6,9,2,1,6,2,7};
        selectionSortRecursion(array,array.length);
        printArray(array);
    }
    public static void selectionSort(int array[]){
        for (int i = 0; i < array.length-1; i++) {
            int indexOfMin=i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[indexOfMin])
                    indexOfMin = j;
            }
            int temp = array[i];
            array[i] = array[indexOfMin];
            array[indexOfMin] = temp;
        }
    }
    public static void selectionSortRecursion(int array[], int length){
        if(length==0) return;
        selectionSortRecursion(array,length-1);
        int indexOfMin=length-1;
        for (int j = length; j < array.length; j++) {
            if(array[j]<array[indexOfMin])
                indexOfMin = j;
        }
        int temp = array[length-1];
        array[length-1] = array[indexOfMin];
        array[indexOfMin] = temp;
    }
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
