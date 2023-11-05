package homework.onlineMarket;

public interface Commads {
    String LOGIN = "0";
    String REGISTER = "1";
    String EXIT = "2";


    String LOGOUT = "0";
    String ADD_PRODUCT = "1";
    String REMOVE_PRODUCT_BY_ID = "2";
    String PRINT_PRODUCTS = "3";
    String PRINT_USERS = "4";
    String PRINT_ORDERS = "5";
    String CHANGE_ORDER_STATUS = "6";


    String LOGOUt = "0";
    String PRINT_ALL_PRODUCTS = "1";
    String BUY_PRODUCT = "2";
    String PRINT_MY_ORDERs = "3";
    String CHANEL_ORDER_BY_ID = "4";

    static void printCommandsByUser() {
        System.out.println("please input " + LOGOUt + " for LOGOUt");
        System.out.println("please input " + PRINT_ALL_PRODUCTS + " for PRINT_ALL_PRODUCTS");
        System.out.println("please input " + BUY_PRODUCT + " for BUY_PRODUCT");
        System.out.println("please input " + PRINT_MY_ORDERs + " for PRINT_MY_ORDERs");
        System.out.println("please input " + CHANEL_ORDER_BY_ID + " for CHANEL_ORDER_BY_ID");
    }

    static void printCommandsByAdmin() {
        System.out.println("please input " + LOGOUT + " for LOGOUT");
        System.out.println("please input " + ADD_PRODUCT + " for ADD_PRODUCT");
        System.out.println("please input " + REMOVE_PRODUCT_BY_ID + " for REMOVE_PRODUCT_BY_ID");
        System.out.println("please input " + PRINT_PRODUCTS + " for PRINT_PRODUCTS");
        System.out.println("please input " + PRINT_USERS + " for PRINT_USERS");
        System.out.println("please input " + PRINT_ORDERS + " for PRINT_ORDERS");
        System.out.println("please input " + CHANGE_ORDER_STATUS + " for CHANGE_ORDER_STATUS");
    }

    static void printFirstCommand() {
        System.out.println("please input " + LOGIN + " for LOGIN");
        System.out.println("please input " + REGISTER + " for REGISTER");
        System.out.println("please input " + EXIT + " for EXIT");

    }
}