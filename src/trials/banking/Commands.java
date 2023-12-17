package trials.banking;

public interface Commands {
    String EXIT = "0";
    String LOGIN = "1";
    String REGISTER = "2";


    String PRINT_USERS = "1";
    String PRINT_DEALS = "2";

//to attach to card

    String ADD_CARD = "1";
    String ADD_MONEY_ON_CARD = "2";
    String TRANSFER_MONEY = "3";
    String TAKE_A_CREDIT = "4";
    String DEPOSIT = "5";
    String PRINT_MY_BALANCE = "6";
    String PRINT_MY_DEALS = "7";


    static void printUserCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_CARD + " for ADD_CARD ");
        System.out.println("please input " + ADD_MONEY_ON_CARD + " for ADD_MONEY_ON_CARD");
        System.out.println("please input " + TRANSFER_MONEY + " for TRANSFER_MONEY");
        System.out.println("please input " + TAKE_A_CREDIT + " for TAKE_A_CREDIT");
        System.out.println("please input " + DEPOSIT + " for DEPOSIT");
        System.out.println("please input " + PRINT_MY_BALANCE + " for PRINT_MY_BALANCE");
        System.out.println("please input " + PRINT_MY_DEALS + " for PRINT_MY_DEALS");

    }

    static void printAdminCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + PRINT_USERS + " for PRINT_USERS");
        System.out.println("please input " + PRINT_DEALS + " for PRINT_DEALS");
    }

    static void printMainCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + LOGIN + " for  LOGIN");
        System.out.println("Please input " + REGISTER + " for REGISTER");
    }
}
