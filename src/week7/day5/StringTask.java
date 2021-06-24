package week7.day5;

import java.util.ArrayList;
import java.util.List;

public class StringTask {

    public static List<Integer> getAnswer(ArrayList<String> list) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            integers.add(countOfOccurrence(list.get(i)));
        }
        return integers;
    }

    private static Integer countOfOccurrence(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
           int length = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    length++;
                    if (j == str.length() - 1) {
                        sum += length / 2;
                        i = j;
                    }
                } else {
                    sum += length / 2;
                    i = j - 1;
                    break;
                }
            }
        }
        return sum;
    }
}
