package work.chapter7;

public class overloadDemo {

    void test() {
        System.out.println("no parameters");
    }

    void test(int a) {
        System.out.println("a : " + a);
    }

    void test(int a, int b) {
        System.out.println("a , b " + a + " " + b);
    }

    double test(double a) {
        System.out.println("krkrnaki " + a);
        return a * a;
    }

}
