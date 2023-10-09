package chapters.chapter7;

public class OverloadTest {

    public static void main(String[] args) {

        String fullname = "poxos poxosyan";
        String surnme = fullname.substring(6);
        String name = fullname.substring(0, 5);
        System.out.println(surnme);
        System.out.println(name);
    }
}
