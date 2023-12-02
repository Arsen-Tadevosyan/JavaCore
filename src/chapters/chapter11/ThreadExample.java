package chapters.chapter11;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {

        MyFirstThread myFirstThread = new MyFirstThread();
        for (int i = 0; i < 4; i++) {
            Thread myThread = new Thread(myFirstThread);
            myThread.start();
        }
//        Thread myThread = new Thread(myFirstThread);
//        myThread.start();

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Main " + i);
//            Thread.sleep(1000);
//        }
    }
}
