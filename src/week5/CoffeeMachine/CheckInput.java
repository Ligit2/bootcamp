package week5.CoffeeMachine;

public class CheckInput {
    public static boolean checkStr(String str) {
        if (!str.contains(":"))
            return false;
        else {
            if (str.charAt(str.length()-1)==':' || str.charAt(0)==':') return false;
            String split[] = str.split(":");
            if (split[0].length() != 1 || !(split[0].equals("C") || split[0].equals("T") || split[0].equals("S")))
                return false;
            if (split[1].length() != 1) {
                return false;
            } else {
                if (split[1].charAt(0) < '0' || split[1].charAt(0) > '9')
                    return false;
                else return true;
            }
        }
    }
}
