package week3.day3;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(returnCharacter("Kitty", 3));

    }
    public static char returnCharacter(String str, int index){
       return str.charAt(index);
    }
}
