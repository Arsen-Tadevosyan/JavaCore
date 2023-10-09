package chapters.chapter5;

public class allExample {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;
        do {
            System.out.println("Cпpaвкa по оператору:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. while");
            System.out.println(" 4. do-while");
            System.out.println(" 5. for\n");
            System.out.println("yntrel");
            choice = (char) System.in.read();
        } while (choice < '1' | choice > '5');
        System.out.println();
        System.out.println();
        switch (choice) {
            case '1':
                System.out.println("if: \n");
                System.out.println("if(payman)  gorcoxutyun");
                System.out.println("else payman");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switch()");
                System.out.println("case   sarberak ");
                System.out.println(" break; verjacnox payman");
                break;
            case '3':
                System.out.println("while:\n");
                System.out.println("while(paymani cikl)   gorcoxutyun");
                break;
            case '4':
                System.out.println("do-while:\n");
                System.out.println("do {gorcoxutyun}");
                System.out.println("while (payman)");
                break;
            case '5':
                System.out.println("for:\n");
                System.out.println("for(payman cikl)");
                System.out.println("gorcoxutyun");
                break;

        }
    }
}
