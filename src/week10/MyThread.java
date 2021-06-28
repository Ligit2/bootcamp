package week10;

public class MyThread implements Runnable {

    @Override
    public void run() {
        long sum2 =0;
        for (int i = 0; i < 5000000; i++) {
            sum2+=i;
        }
    }
}
