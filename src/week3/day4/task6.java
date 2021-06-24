package week3.day4;

public class task6 {
    public static void main(String[] args) {
        System.out.println(countOfx("xvcxx", 5));
    }
    public static int countOfx(String str,int length){
        int count = 0;
        if(length-1<0) return 0;
        if(str.charAt(length-1)=='x')
            count = 1;
         return count + countOfx(str, length-1);
    }
}
