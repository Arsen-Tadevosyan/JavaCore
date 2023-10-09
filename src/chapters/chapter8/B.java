package chapters.chapter8;

public class B extends A {
    int k;


    public B (){
        System.out.println(" b constructor");
    }
    @Override
    void show() {
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }
}
