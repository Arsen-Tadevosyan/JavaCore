package HomeWorks;

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
        for (double i = 0; i < 100; i = i + 10) {
            i %= 3;
            System.out.print(i + " ");
        }
    }
}

