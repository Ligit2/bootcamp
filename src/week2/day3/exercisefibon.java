package week2.day3;

public class exercisefibon {
    public static void main(String[] args) {
        int[] arr = new int [10];
        arr[0] = 1;
        arr[1] =1;
        for(int i=2; i<10; i++)
        {
            arr[i] = arr[i-1] + arr[i-2];
        }
        for(int i =9; i>=0 ; i--)
        {
            System.out.println(arr[i]);
        }
    }
}
