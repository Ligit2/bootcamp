package week3.day2;

public class Exercise4 {
    public static void main(String[] args) {
        int array[] = new int[]{1,2,3,4,5};
        System.out.println(search(array, 7));
        System.out.println(search(array, 7, 6));
    }
    public static int search(int array[]){
        return array.length;
    }
    public static int search(int array[], int a){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == a) return i;
        }
        return -1;
    }
    public static boolean search(int array[], int a, int index){
        if(index >= array.length) return false;
        if(array[index]==a) return true;
        return false;
    }
}
