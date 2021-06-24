package week3.day4;
//InsertionSort time complexity in worst case when numbers in desc order -O(n^2),
// in best case when number in asc order - O(n)
// time complexity - O(1)
//in Recursion implementation space complexity is O(n) because
//We are recursively calling the function for each element of the array

public class bubblesort {
    public static void main(String[] args) {
        int array[] = new int[50000];
        int n = 50000;
        for (int i = 0; i < array.length; i++) {
            array[i] = n--;
        }
        long start = System.currentTimeMillis();
        int[] sorted = bubbleSort(array);
        long end = System.currentTimeMillis();
        System.out.println("computation time -> " + (end - start));
    }

    public static int[] bubbleSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int[] bubbleSortRecursion(int array[], int length) {
        if (length == 1) return array;
        for (int i = 0; i < length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        return bubbleSortRecursion(array, length - 1);
    }
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
