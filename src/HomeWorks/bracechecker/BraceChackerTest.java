package HomeWorks.bracechecker;

public class BraceChackerTest {

    public static void main(String[] args) {
        String text = "Hello (from) [java}";
        BraceChecker braceChecker = new BraceChecker(text, '[', ']');
        braceChecker.check();
        BraceChecker braceChecker1 = new BraceChecker(text, '(', ')');
        braceChecker1.check();
    }
}