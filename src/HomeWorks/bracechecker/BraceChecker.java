package HomeWorks.bracechecker;

public class BraceChecker {

    private String text;

    public BraceChecker(String tx) {
        text = tx;
    }


    public void check() {
        int i;
        for (i = 0; i < text.length(); i++) {
            char size;
            char b = text.charAt(i);
            if (b == '(') {
                size = text.charAt(i);
                for (int j = i; j < text.length(); j++) {
                    if (text.charAt(j) == ')') {
                        System.out.println("not problem");
                        break;
                    }
                }
            }
        }
        if (i == text.length()) {
            System.out.print("(opened not closed)");
        }


//        for (int i = 0; i < text.length(); i++) {
//            switch (text.charAt(i)) {
//                case '[':
//                    System.out.print('[');
//                    break;
//                case ']':
//                    System.out.print(']');
//                    break;
//                case '(':
//                    System.out.print('(');
//                    break;
//                case ')':
//                    System.out.print(')');
//                    break;
//                case '{':
//                    System.out.print('{');
//                    break;
//                case '}':
//                    System.out.print('}');
//                default:
//                    System.out.print(" ");
//            }

    }

}

