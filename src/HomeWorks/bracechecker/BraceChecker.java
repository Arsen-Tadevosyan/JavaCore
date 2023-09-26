package HomeWorks.bracechecker;

public class BraceChecker {

    private String text;
    char s;
    char s1;

    public BraceChecker(String tx, char si, char si1) {
        text = tx;
        s = si;
        s1 = si1;

    }


    public void check() {
        int a = 0;
        int i;
        for (i = 0; i < text.length(); i++) {
            char size;
            char b = text.charAt(i);
            if (b == s) {
                size = text.charAt(i);
                for (int j = i; j < text.length(); j++) {
                    if (text.charAt(j) == s1) {
                        System.out.println("not problem");
                        a++;
                        break;
                    }
                }
            }
        }
        if (a == 0) {
            System.out.println(s + "opened not closed" + s1);
        }


    }

}

