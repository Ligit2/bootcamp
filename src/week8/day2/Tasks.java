package week8.day2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Tasks {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
//        task11();
//        task14();
//        task17();
//        task18();
        //task19();
        task20();
    }

    private static void task20() {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("text1.txt", "rw")) {
            long number = randomAccessFile.readByte();
            randomAccessFile.seek(number);
            int i = randomAccessFile.readInt();
            System.out.println(i);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void task19() {
        try {
            char read = (char) System.in.read();
            FileReader fileReader = new FileReader("text1.txt");
            int count = 0;
            int c = fileReader.read();
            while (c != -1) {
                if ((char) c == read)
                    count++;
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void task18() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("text1.txt"))) {
            Stream<String> lines = bufferedReader.lines();
            Iterator<String> iterator = lines.iterator();
            String answer = "";
            while (iterator.hasNext()) {
                String s = iterator.next();
                String[] s1 = s.split(" ");
                int max = 0;
                for (int i = 0; i < s1.length; i++) {
                    if (s1[i].length() >= max) {
                        max = s1[i].length();
                        answer = s1[i];
                    }
                }
                System.out.println(answer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void task17() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text1.txt", true))) {
            bufferedWriter.write("shunik");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void task14() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("text1.txt"))) {
            Stream<String> lines = bufferedReader.lines();
            Iterator<String> iterator = lines.iterator();
            ArrayList<String> array = new ArrayList<>();
            while (iterator.hasNext()) {
                array.add(iterator.next());
            }
            System.out.println(Arrays.toString(array.toArray()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void task11() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("text1.txt"))) {
            Stream<String> lines = bufferedReader.lines();
            Iterator<String> iterator = lines.iterator();
            while (iterator.hasNext()) {
                String next = iterator.next();
                System.out.println(next);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void task10() {
        File file = new File("text1.txt");
        try (FileInputStream fileOutputStream = new FileInputStream(file)) {
            byte array[] = fileOutputStream.readAllBytes();
            String s = new String(array);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void task9() {
        File file = new File("text1.txt");
        long length = file.length();
        long kb = length / 1024;
        System.out.print(length + " " + kb);
    }

    private static void task8() {
        File file = new File("text1.txt");

        BufferedReader bufferedInputStream = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            String s = bufferedInputStream.readLine();
            bufferedWriter.write(s);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void task7() {
        String path = "C:\\Users\\User\\IdeaProjects\\week8\\src\\com\\company\\day2\\files";
        File file = new File(path);
        File[] files = file.listFiles();
        System.out.println(files[0].lastModified());
    }

    private static void task6() {
        String path1 = "C:\\Users\\User\\IdeaProjects\\week8\\src\\com\\company\\day2\\files\\text2.txt";
        String path2 = "C:\\Users\\User\\IdeaProjects\\week8\\src\\com\\company\\day2\\urishfiles\\urishtext.txt";
        try (FileReader fileReader1 = new FileReader(path1);
             FileReader fileReader2 = new FileReader(path2)) {
            int count = 0;
            while (fileReader1.read() != -1 && fileReader2.read() != -1) {
                char a = (char) fileReader1.read();
                char b = (char) fileReader2.read();
                if (a != b)
                    count++;
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void task5() {
        String path = "C:\\\\Users\\\\User\\\\IdeaProjects\\\\week8\\\\src\\\\com\\\\company\\\\day2\\\\files";
        File file = new File(path);
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
    }

    private static void task4() {
        String path = "C:\\\\Users\\\\User\\\\IdeaProjects\\\\week8\\\\src\\\\com\\\\company\\\\day2\\\\files";
        File file = new File(path);
        System.out.println(file.canRead() && file.canWrite());
    }

    private static void task3() {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.next();
        File file = new File(path);
        System.out.println(file.exists());
    }

    private static void task2() {
        String path = "C:\\\\Users\\\\User\\\\IdeaProjects\\\\week8\\\\src\\\\com\\\\company\\\\day2\\\\files";
        String extension = ".txt";
        File file = new File(path);


        FilenameFilter filenameFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(extension);
            }
        };
        String[] list = file.list(filenameFilter);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    private static void task1() {
        String path = "C:\\Users\\User\\IdeaProjects\\week8\\src\\com\\company\\day2\\files";
        File files = new File(path);
        String[] list = files.list();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

}
