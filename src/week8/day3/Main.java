package week8.day3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
       /* Console console = System.console();
        boolean b = console != null;
        System.out.println(b);
        if (console != null) {
            console.writer().print("How excited are you about your trip today? ");
            console.flush();
            String excitementAnswer = console.readLine();
            String name = console.readLine("Please enter your name: ");
        }*/
        try ( ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("text.txt"));
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("text.txt"))) {
            SubClass subClass = new SubClass();
            objectOutputStream.writeObject(subClass);
            SubClass obj = (SubClass) objectInputStream.readObject();
            System.out.println(obj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
