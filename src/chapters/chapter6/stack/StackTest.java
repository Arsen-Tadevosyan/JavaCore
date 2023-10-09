package chapters.chapter6.stack;

public class StackTest {

    public static void main(String[] args) {

        Stack myStack = new Stack();
        Stack myStack2=new Stack();
        myStack.push(55);
        myStack.push(66);
        myStack.push(77);
        
        int a = myStack.pop();
        int b = myStack.pop();
        int l = myStack.pop();

        System.out.println(a);
        System.out.println(b);
        System.out.println(l);
        System.out.println(myStack2.pop());
    }
}
