package week2.day1;

/**
 * Created by ACA Student 005 on 5/3/2021.
 */
public class Exercise10 {
    public static void main(String[] args) {
        int c = 32;
        int count =0;
        while(c<= 122)
        {
            char symbol = (char) c;
            System.out.print(symbol + " ");
            count++;
            if(count == 10) {
                count = 0;
                System.out.println();
            }
            c++;
        }
    }
}
