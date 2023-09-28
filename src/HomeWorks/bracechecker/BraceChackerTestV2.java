package HomeWorks.bracechecker;

public class BraceChackerTestV2 {

    public static void main(String[] args) {
        String text = "Hello (from) [java}";
        BraceCheckerV2 braceChecker = new BraceCheckerV2(text, '[', ']');
        braceChecker.check();
        BraceCheckerV2 braceChecker1 = new BraceCheckerV2(text, '(', ')');
        braceChecker1.check();
    }
}
