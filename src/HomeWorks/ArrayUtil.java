package HomeWorks;

public class ArrayUtil {
    public static void main(String[] args) {
        //1
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println();
        //2
        System.out.println(numbers[0]);
        System.out.println();
        System.out.println();
        //3
        System.out.println(numbers.length - 1);
        System.out.println();
        System.out.println();
        //4
        System.out.println(numbers.length);
        System.out.println();
        System.out.println();
        //5
        int a = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < a) a = numbers[i];
        }
        System.out.println(a);
        System.out.println();
        System.out.println();
        //6
        int b = numbers[numbers.length / 2];
        if (2 > numbers.length / 2) System.out.println("cant print middle values.");
        else System.out.println(b);
        System.out.println();
        System.out.println();
        //7
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println();
        //8
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1)
                System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println();
        //9
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        System.out.println(sum);
        System.out.println();
        System.out.println();
        //10
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        sum = sum / numbers.length;
        System.out.println(sum);

    }
}
