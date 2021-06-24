package week3.day1;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        System.out.println(magicSum());
    }
    public static int magicSum(){
        Scanner scanner = new Scanner(System.in);
        int sum =0;
      while(true)
      {
          int number = scanner.nextInt();
          if(number == -1) return sum;
          if(hasEight(number))
          sum += number;
      }
    }
    public static boolean hasEight(int n){
        while(n!=0)
        {
            int digit = n%10;
            if(digit==8) return true;
            n/=10;
        }
        return false;
    }
}
