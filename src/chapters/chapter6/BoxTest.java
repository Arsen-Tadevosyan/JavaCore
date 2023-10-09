package chapters.chapter6;

public class BoxTest {
    public static void main(String[] args) {
        Box myBox = new Box(10, 4, 3);
        Box myBox2 = new Box();
        Box mybox3 = new Box(2);

        System.out.println(myBox.depth);
        System.out.println(myBox.width);
        System.out.println(myBox2.width);
        System.out.println(mybox3.width);
        System.out.println(mybox3.depth);

    }
}
