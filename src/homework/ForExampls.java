package homework;

public class ForExampls {
    public static void main(String[] args) {
        //1
        for (int i = 1; i < 1001; i++) {
            System.out.print(i);
            if (i < 1000) System.out.print("-");
        }
        System.out.println();
        System.out.println();
        //2
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) System.out.print(i + " ");

        }
        System.out.println();
        System.out.println();
        //3
        int[] array = {2, 5, 8, 4, 9, 3, 7};
        int a = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > a) a = array[i];
        }
        System.out.println(a);
    }
}


