package chapters.chapter14;

public class storageTest {
    public static void main(String[] args) {
        Storage<String> stringStorage = new Storage<>();
        stringStorage.add("poxos");
        stringStorage.add("petros");

//        stringStorage.print();
//        System.out.println(stringStorage.getByIndex(1));

        Storage<Integer> integerStorage = new Storage<>();
        integerStorage.add(9);
        integerStorage.add(7);
        integerStorage.print();

    }
}
