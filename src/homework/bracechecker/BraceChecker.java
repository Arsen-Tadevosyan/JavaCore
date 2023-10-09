package homework.bracechecker;

import chapters.chapter6.stack.Stack;

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
                        System.out.println("Error. " + o + " closed, but not opened. at " + i);
                    } else if (l != '{') {
                        System.out.println("Error. " + o + " closed, but opened " + l + " at " + i);
                    }
                    break;
                case ')':
                    l = (char) stack.pop();
                    if (l == 0) {
                        System.out.println("Error. " + o + " closed, but not opened. at " + i);
                    } else if (l != '(') {
                        System.out.println("Error. " + o + " closed, but opened " + l + " at " + i);
                    }
                    break;
                case ']':
                    l = (char) stack.pop();
                    if (l == 0) {
                        System.out.println("Error. " + o + " closed, but not opened. at " + i);
                    } else if (l != '[') {
                        System.out.println("Error. " + o + " closed, but opened " + l + " at " + i);
                    }
                    break;
            }
        }

        while (stack.getIndex() != -1) {
            System.out.println("Error. opened " + (char)stack.pop() + " but not closed");
        }

    }
}
