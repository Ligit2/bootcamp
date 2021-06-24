package week2.day5;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m= scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i%2==0)
                {
                    if(j%2==0)
                        System.out.print('O');
                    else
                        System.out.print('X');
                }
                else
                {
                    if(j%2 ==0)
                        System.out.print('X');
                    else
                        System.out.print('O');
                }
            }
            System.out.println();
        }
    }
}
