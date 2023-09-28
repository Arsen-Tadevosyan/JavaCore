package work.chapter7;

public class BDemo {
    public static void main(String[] args) {

        B.y = 10;

        B b = new B();

        b.x = 10;

        B b1 = new B();
        b1.x = 20;

        B.hello();

    }
}
