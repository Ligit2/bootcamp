package week2.day3;

public class Exercise {
    public static void main(String[] args) {
        int []arr = new int[1000];
        for(int i=0; i<1000; i++)
        {
            arr[i] =  7* (i+1);
        }
        for(int i=0;i<1000; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
