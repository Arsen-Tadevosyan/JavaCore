package chapters.chapter6;

public class BoxTest2 {
    public static void main(String[] args) {
        Box b1 = new Box(5,3,7);
        Box b2 = b1;
        Box b3 = new Box(5,87,19);
        System.out.println(b2.width);
    }
}
