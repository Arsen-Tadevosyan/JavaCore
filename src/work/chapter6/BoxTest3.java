package work.chapter6;

public class BoxTest3 {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox.width = 10;
        myBox.depth = 20;
        myBox.height = 15;
        vol = myBox.volume();
        System.out.println(vol);
    }
}
