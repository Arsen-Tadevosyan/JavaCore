package HomeWorks.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray dy = new DynamicArray();


        for (int i = 0; i < 12; i += 2) {
            dy.add(i);
        }
        dy.print();

        System.out.println();
        int a = dy.getbyindex(13);
        System.out.println(a);

        int b = dy.getbyindex(3);
        System.out.println(b);
    }
}
