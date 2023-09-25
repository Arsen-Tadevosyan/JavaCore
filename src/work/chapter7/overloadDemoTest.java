package work.chapter7;

public class overloadDemoTest {

    public static void main(String[] args) {
        overloadDemo ob = new overloadDemo();
        double resulit;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        resulit = ob.test(123.25);
        System.out.println("ardyunk " + resulit);
    }
}