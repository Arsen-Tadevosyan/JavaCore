package trials.banking;

import trials.banking.deals.Credit;
import trials.banking.deals.Deal;
import trials.banking.deals.Deposit;
import trials.banking.enums.DealEnum;
import trials.banking.enums.Money;
import trials.banking.model.Admin;
import trials.banking.model.Card;
import trials.banking.model.User;
import trials.banking.storage.StorageAdmin;
import trials.banking.storage.StorageCard;
import trials.banking.storage.StorageDeal;
import trials.banking.storage.StorageUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BankingMain implements Commands {
    static StorageCard storageCard = new StorageCard();
    static StorageDeal storageDeal = new StorageDeal();
    static StorageAdmin storageAdmin = new StorageAdmin();
    static StorageUser storageUser = new StorageUser();
    static Scanner scanner = new Scanner(System.in);
    static User currentUser = null;

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands.printMainCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.err.println("try again");
            }
        }
    }

    private static void login() {
        System.out.println("please input email");
        String email = scanner.nextLine();
        System.out.println("please input password");
        String password = scanner.nextLine();
        Admin byEmail = storageAdmin.getByEmail(email);
        if (byEmail != null) {
            Admin byPassword = storageAdmin.getByPassword(password);
            if (byPassword == null) {
                System.out.println("email or password incorrect");
                return;
            }
            if (byPassword.getEmail().equals(byEmail.getEmail())) {
                commandForAdmin();
            }
        } else {
            User userByEmailEmail = storageUser.getByEmail(email);
            if (userByEmailEmail != null) {
                User userByPassword = storageUser.getByPassword(password);
                if (userByEmailEmail.getEmail().equals(userByPassword.getEmail())) {
                    currentUser = userByPassword;
                    commandForUser();
                } else {
                    System.out.println("email or password incorrect");
                }
            } else {
                System.out.println("email or password incorrect");
            }
        }
    }

    private static void commandForUser() {
        boolean isRun = true;
        while (isRun) {
            Commands.printUserCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    currentUser = null;
                    isRun = false;
                    break;
                case ADD_CARD:
                    addCard();
                    break;
                case ADD_MONEY_ON_CARD:
                    addMoneyOnCard();
                    break;
                case TRANSFER_MONEY:
                    transferMoney();
                    break;
                case TAKE_A_CREDIT:
                    takeCredit();
                    break;
                case DEPOSIT:
                    deposit();
                    break;
                case PRINT_MY_BALANCE:
                    printBalance();
                    break;
                case PRINT_MY_DEALS:
                    printDeals();
                    break;
                default:
                    System.err.println("try again");
            }
        }
    }

    private static void deposit() {
        System.out.println("please input your deposit size");
        double sizeDeposit = Double.parseDouble(scanner.nextLine());
        Card card = storageCard.getByUser(currentUser);
        Deposit deposit = new Deposit(4, card.getCurrency(), sizeDeposit, 1, DealEnum.IN_PROGRESS);
        double balance = card.getBalance();
        card.setBalance(balance+sizeDeposit);
        currentUser.getDeals().add(deposit);
        storageDeal.add(deposit);
        System.out.println("Thank you for using our services");
    }

    private static void takeCredit() {
        System.out.println("please input credit size");
        double sizeMoney = Double.parseDouble(scanner.nextLine());
        Card card = storageCard.getByUser(currentUser);
        Credit credit = new Credit(4, card.getCurrency(), sizeMoney, DealEnum.IN_PROGRESS);
        double balance = card.getBalance();
        card.setBalance(balance + sizeMoney);
        currentUser.getDeals().add(credit);
        storageDeal.add(credit);
        System.out.println("Thank you for using our services");
    }

    private static void printDeals() {
        List<Deal> deals = currentUser.getDeals();
        for (Deal deal : deals) {
            System.out.println(deal);
        }
    }

    private static void printBalance() {
        Card card = storageCard.getByUser(currentUser);
        System.out.println(card.getBalance());
    }

    private static void transferMoney() {
        System.out.println("please input id to which you want to transfer");
        String id = scanner.nextLine();
        Card byId = storageCard.getById(id);
        if (byId != null) {
            System.out.println("please input currency RUB,USD,AMD");
            String currency = scanner.nextLine().toUpperCase();
            Money money = null;
            switch (currency) {
                case "RUB":
                    money = Money.RUB;
                    break;
                case "USD":
                    money = Money.USD;
                    break;
                case "AMD":
                    money = Money.AMD;
                    break;
                default:
                    System.err.println("try again");
                    return;
            }
            System.out.println("please input the amount of money to be transferred");
            double sizeMoney = Double.parseDouble(scanner.nextLine());
            Card card = storageCard.getByUser(currentUser);

            double balance2 = card.getBalance();
            if (balance2 < sizeMoney) {
                System.err.println("not enough money");
                return;
            }
            card.setBalance(balance2 - sizeMoney);

            Money cardCurrency = card.getCurrency();
            double balance = card.getBalance();
            double value = 0;
            switch (money) {
                case AMD:
                    switch (cardCurrency) {
                        case RUB:
                            value = sizeMoney / 5;
                            break;
                        case USD:
                            value = sizeMoney / 400;
                            break;
                        case AMD:
                            value = sizeMoney;
                            break;
                    }
                    break;
                case USD:
                    switch (cardCurrency) {
                        case RUB:
                            value = sizeMoney * 90.65;
                            break;
                        case USD:
                            value = sizeMoney;
                            break;
                        case AMD:
                            value = sizeMoney * 400;
                            break;
                    }
                    break;
                case RUB:
                    switch (cardCurrency) {
                        case RUB:
                            value = sizeMoney;
                            break;
                        case USD:
                            value = sizeMoney / 0.011;
                            break;
                        case AMD:
                            value = sizeMoney * 5;
                            break;
                    }
                    break;
            }
            double balance1 = byId.getBalance();
            byId.setBalance(balance1 + value);
        }
    }

    private static void addMoneyOnCard() {
        System.out.println("please input currency RUB,USD,AMD");
        String currency = scanner.nextLine().toUpperCase();
        Money money = null;
        switch (currency) {
            case "RUB":
                money = Money.RUB;
                System.out.println("Compared to the Russian ruble, AMD=0.22 USD= 90.65");
                break;
            case "USD":
                money = Money.USD;
                System.out.println("Compared to the USA dollar, RUB=0.011 AMD=0.0025");
                break;
            case "AMD":
                money = Money.AMD;
                System.out.println("Compared to the Armenian dram, RUB=5 USD=400");
                break;
            default:
                System.err.println("try again");
                return;
        }
        System.out.println("please input amount of money");
        double amount_of_money = Double.parseDouble(scanner.nextLine());
        Card card = storageCard.getByUser(currentUser);
        double balance = card.getBalance();
        Money cardCurrency = card.getCurrency();
        double value = 0;
        switch (money) {
            case AMD:
                switch (cardCurrency) {
                    case RUB:
                        value = amount_of_money / 5;
                        break;
                    case USD:
                        value = amount_of_money / 400;
                        break;
                    case AMD:
                        value = amount_of_money;
                        break;
                }
                break;
            case USD:
                switch (cardCurrency) {
                    case RUB:
                        value = amount_of_money * 90.65;
                        break;
                    case USD:
                        value = amount_of_money;
                        break;
                    case AMD:
                        value = amount_of_money * 400;
                        break;
                }
                break;
            case RUB:
                switch (cardCurrency) {
                    case RUB:
                        value = amount_of_money;
                        break;
                    case USD:
                        value = amount_of_money / 0.011;
                        break;
                    case AMD:
                        value = amount_of_money * 5;
                        break;
                }
                break;
        }
        double v = balance + value;
        card.setBalance(v);
        System.out.println("Thank you for using our services");
    }


    private static void addCard() {
        System.out.println("please input currency RUB,USD,AMD");
        String currency = scanner.nextLine().toUpperCase();
        Money money = null;
        switch (currency) {
            case "RUB":
                money = Money.RUB;
                break;
            case "USD":
                money = Money.USD;
                break;
            case "AMD":
                money = Money.AMD;
                break;
            default:
                System.err.println("try again");
                return;
        }
        Card card = new Card(IdGenerator.generateId(), money, currentUser, 0);
        storageCard.add(card);
        System.out.println("card crated");
    }

    private static void commandForAdmin() {
        boolean isRun = true;
        while (isRun) {
            Commands.printAdminCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case PRINT_USERS:
                    storageUser.print();
                    break;
                case PRINT_DEALS:
                    storageDeal.print();
                    break;
                default:
                    System.err.println("try again");
            }
        }
    }

    private static void register() {
        System.out.println("please input, you ADMIN or USER");
        String type = scanner.nextLine();
        if (type.equalsIgnoreCase("ADMIN")) {
            System.out.println("please input email");
            String email = scanner.nextLine();
            System.out.println("please input password");
            String password = scanner.nextLine();
            Admin admin = new Admin(email, password);
            storageAdmin.add(admin);
            System.out.println("registered");
        } else if (type.equalsIgnoreCase("USER")) {
            System.out.println("please input name");
            String name = scanner.nextLine();
            System.out.println("please input surname");
            String surname = scanner.nextLine();
            System.out.println("please input age");
            int age = Integer.parseInt(scanner.nextLine());
            if (age < 18) {
                System.err.println("wrong age");
                return;
            }
            System.out.println("please input phone number");
            String phone_number = scanner.nextLine();
            System.out.println("please input email");
            String email = scanner.nextLine();
            System.out.println("please input password");
            String password = scanner.nextLine();
            List<Deal> deals = new ArrayList<>();
            User user = new User(name, surname, age, phone_number, email, password, deals);
            storageUser.add(user);
            System.out.println("registered!");
        } else {
            System.out.println("invalid command");
        }
    }
}
