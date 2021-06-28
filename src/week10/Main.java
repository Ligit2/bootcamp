package week10;

public class Main {
    public static void main(String[] args) {
        long start = System.nanoTime();
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);
        thread1.start();
        thread2.start();
        long end = System.nanoTime();
        System.out.println(end - start);
    }
}
