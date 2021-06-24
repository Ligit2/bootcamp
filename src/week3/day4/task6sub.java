package week3.day4;

public class task6sub {
    public static void main(String[] args) {
        System.out.println(countOfx("xvcxx"));
    }
    public static int countOfx(String str){
        int count = 0;
        if(str.length()-1<0) return 0;
        if(str.charAt(0)=='x')
            count = 1;
        return count + countOfx(str.substring(1));
    }
}
