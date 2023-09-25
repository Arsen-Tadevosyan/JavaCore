package HomeWorks.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray dy = new DynamicArray();


        for (int i = 0; i < 12; i += 2) {
            dy.add(i);
        }
        dy.deleteBylndex(2);
        dy.print();

        System.out.println();
        int a = dy.getbyindex(13);
        System.out.println(a);

        int b = dy.getbyindex(3);
        System.out.println(b);

        System.out.println();
        dy.print();
        dy.deleteBylndex(2);
        dy.print();

        System.out.println();
        dy.set(1, 9);
        dy.print();


        dy.add(2, 55);
        dy.print();

        System.out.println(dy.exists(6));
        System.out.println(dy.exists(5));


        System.out.println(dy.getIndexByValue(55));
    }
}
