package week3.day5;
//InsertionSort time complexity in worst case when numbers in desc order -O(n^2),
// in best case when number in asc order - O(n)
// space complexity - O(1)
//As we are calling the function recursively for (n – 1) elements,
// It will be stored in the call stack, so Space complexity is O(n).
public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {4,6,9,2,1,6,2,7};
        insertionSortRecursion(array,array.length);
        printArray(array);
    }
    public static int[] insertionSort(int array[]){
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j=i-1;
            while(j>=0 && array[j]>key){
                int temp = array[j];
                array[j]=array[j+1];
                array[j+1] = temp;
                j--;
            }
        }
        return array;
    }
    static int index =1;
    public static void insertionSortRecursive(int array[], int length){
        if(index >= length) return;
        int key = array[index];
        int j=index-1;
        while(j>=0 && array[j]>key){
            int temp = array[j];
            array[j]=array[j+1];
            array[j+1] = temp;
            j--;
        }
        index++;
        insertionSortRecursive(array,length);
    }
    public static void insertionSortRecursion(int array[], int length)
    {
        if(length<=1) return;
        insertionSortRecursion(array,length-1);
        int key = array[length-1];
        int j= length -2;
        while(j>=0 && array[j]>key){
            int temp = array[j+1];
            array[j+1]=array[j];
            array[j]=temp;
            j--;
        }
    }
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
