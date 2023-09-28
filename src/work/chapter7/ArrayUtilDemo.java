package work.chapter7;

public class ArrayUtilDemo {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = {4, 5, 6, 2};
        arrayUtil.printArray(numbers);

        ArrayUtil arrayUtil1 = new ArrayUtil();
        arrayUtil.printArray(numbers);

        ArrayUtil.printArray(numbers);
    }
}
