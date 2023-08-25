package homework.chapter2;

public class ForSemple {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i = i + 1) {
            System.out.println((i + 1) + "MessI");
            if (i == 50) {
                System.out.println("Lionel Messi");
            }
        }
    }
}
