package HomeWorks.bracechecker;

import work.chapter6.stack.Stack;

public class BraceChecker {

    private String Text;

    BraceChecker(String T) {
        Text = T;
    }

    public void check() {
        Stack stack = new Stack();
        char l;
        for (int i = 0; i < Text.length(); i++) {
            char o = Text.charAt(i);
            switch (o) {
                case '[':
                case '{':
                case '(':
                    stack.push(o);
                    break;
                case '}':
                    l = (char) stack.pop();
                    if (l == 0) {
                        System.out.println("Closed but not opened ");
                    } else if (l != '{') {
                        System.out.println("} Closed but opened " + l);
                    }
                    break;
                case ')':
                    l = (char) stack.pop();
                    if (l == 0) {
                        System.out.println("Closed but not opened ");
                    } else if (l != '(') {
                        System.out.println(") Closed but opened " + l);
                    }
                    break;
                case ']':
                    l = (char) stack.pop();
                    if (l == 0) {
                        System.out.println("Closed but not opened ");
                    } else if (l != '[') {
                        System.out.println("] Closed but opened " + l);
                    }
                    break;
            }
        }
        while ((l = (char) stack.pop()) != 0) {
            System.out.println("opened " + l + " but not closed");
        }

    }
}
