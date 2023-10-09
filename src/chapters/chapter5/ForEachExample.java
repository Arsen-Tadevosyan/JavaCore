package chapters.chapter5;

public class ForEachExample {
    public static void main(String[] args) {
        int[] array = {2, 4, 7, 9};
        char[] a = {'a', 'h', 'g', 's'};
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (char i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[] b = {2, 4, 7, 4, 8, 5,};
        for (int x : b) {
            if (x == 8){
                System.out.println(8);
                break;}
        }
    }
}