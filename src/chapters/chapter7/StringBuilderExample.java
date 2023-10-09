package chapters.chapter7;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder resulit =new StringBuilder("helllo");
        for (int i = 0; i < 10; i++) {
            resulit.append(i);
        }
        System.out.println(resulit);
    }
}
