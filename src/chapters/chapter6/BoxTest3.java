package chapters.chapter6;

public class BoxTest3 {
    public static void main(String[] args) {
        Box myBox = new Box(30,1,34);
        Box myBox2 = new Box(60,12,32);
        double vol;
        vol = myBox.volume();
        System.out.println(vol);
    }
}
