package week3.day4;

public class bubbleSortOpt {
    public static void main(String[] args) {
        int array[] = new int[50000];
        int n=50000;
        for (int i = 0; i < array.length; i++) {
            array[i]=n--;
        }
        long start = System.currentTimeMillis();
        int [] sorted = bubbleSortOptimization(array);
        long end = System.currentTimeMillis();
        System.out.println("computation time -> " + (end - start));

    }

    public static int[] bubbleSortOptimization(int array[]) {
        for (int i = 0; i < array.length; i++) {
            boolean check = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    check = true;
                }
            }
            if (check == false)
                break;
        }
        return array;
    }
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
