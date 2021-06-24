package week3.day4;

public class task1 {
    public static void main(String[] args) {
        int array[] = new int []{1,2,3,4};
       System.out.println(sumOfArray(array, array.length));
    }
    public static int sumOfArray(int array[], int length){
       if(length==1) return array[0];
        return array[length-1] + sumOfArray(array,length-1);
    }
}
