package chapters.chapter11;

public class MyFirstThread implements Runnable {


    @Override
    public void run() {
        Thread thread = Thread.currentThread();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(thread.getName() + " " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
