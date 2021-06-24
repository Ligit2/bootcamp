package week8;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("anun.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("apus.txt"))) {
            bufferedWriter.write("fghj");
            bufferedWriter.write("fghj");
            bufferedWriter.close();
            FileOutputStream fileOutputStream = new FileOutputStream("apus.txt",true);
            fileOutputStream.write('\n');
            fileOutputStream.write('b');

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
