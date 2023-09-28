package HomeWorks.bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "hello (from) [java}";
        BraceChecker B1 = new BraceChecker(text);
        B1.check();
    }
}
