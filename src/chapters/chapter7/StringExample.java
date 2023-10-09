package chapters.chapter7;

public class StringExample {
    public static void main(String[] args) {

        String fullname = "poxos poxosyan poxosi";


        String name = "POXos";
        String name1 = "poxos";
        String nameLower = name.toLowerCase();
        String nameupper = name1.toUpperCase();
        System.out.println(nameLower);
        System.out.println(nameupper);


        System.out.println(name.toLowerCase().equals(name1));

        boolean n = name1.startsWith("p");
        System.out.println(n);


        boolean l = name1.endsWith("s");
        System.out.println(n);


        boolean p = name1.contains("x");
        System.out.println(n);


        String o = name.replace("o", "-");
        System.out.println(o);


        String[] split = fullname.split(" ");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
