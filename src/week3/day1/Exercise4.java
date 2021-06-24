package week3.day1;

public class Exercise4 {
    public static void main(String[] args) {

        System.out.println(election(false, false, false));
        System.out.println((false ^ false));
    }

    public static boolean election(boolean x, boolean y, boolean z) {
        return (z && y || y && x);
    }
}

