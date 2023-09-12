package work.chapter6;

public class BoxTest {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox2 = new Box();
        myBox.width = 7;
        myBox.depth = 12;
        myBox2.width = 10;
        System.out.println(myBox.depth);
        System.out.println(myBox.width);
        System.out.println(myBox2.width);
    }
}
