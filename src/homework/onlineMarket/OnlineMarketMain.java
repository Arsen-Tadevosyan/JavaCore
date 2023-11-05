package homework.onlineMarket;


import homework.onlineMarket.enums.EnumForUser;
import homework.onlineMarket.model.User;
import homework.onlineMarket.storage.StorageOrder;
import homework.onlineMarket.storage.StorageProduct;
import homework.onlineMarket.storage.StorageUser;

import java.util.Scanner;
import java.util.UUID;


public class OnlineMarketMain implements Commads {
    private static Scanner scanner = new Scanner(System.in);
    private static StorageUser storageUser = new StorageUser();
    private static StorageOrder storageOrder = new StorageOrder();
    private static StorageProduct storageProduct = new StorageProduct();
    public static User currentUser = null;

    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            Commads.printFirstCommand();
            String command = scanner.nextLine();
            switch (command) {
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                case EXIT:
                    isRun = false;
                    break;
                default:
                    System.out.println("invalid command . try again");
            }
        }
    }

    private static void login() {
        System.out.println("please input email");
        String email = scanner.nextLine();
        User userFromStorage = storageUser.getByEmail(email);
        if (userFromStorage == null) {
            System.out.println("User with " + email + " dose not exists!");
            return;
        }
        System.out.println("please input password");
        String password = scanner.nextLine();
        User userFromStorageByPassword = storageUser.getByPassword(password);
        try {
            if (userFromStorageByPassword.getPassword().equals(userFromStorage.getPassword())) {
                System.out.println("everything is fine");
                currentUser = userFromStorage;
            }
        } catch (NullPointerException e) {
            System.out.println("wrong email or password");
        }
    }

    private static void register() {
        System.out.println("please input name");
        String name = scanner.nextLine();
        System.out.println("please input email");
        String email = scanner.nextLine();
        User userFromStorage = storageUser.getByEmail(email);
        if (userFromStorage != null) {
            System.out.println("User with " + email + " already exists!");
            return;
        }
        System.out.println("please input password");
        String password = scanner.nextLine();
        System.out.println("please input type USER or ADMIN");
        String type = scanner.nextLine();
        EnumForUser enumForUser;
        try {
            enumForUser = EnumForUser.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("wrong answer");
            return;
        }
        String uuid = UUID.randomUUID().toString();
        String[] uuids = uuid.split("-");
        String id = uuids[0];
        User user = new User(id, name, email, password, enumForUser);
        storageUser.add(user);
        System.out.println("registred");
        currentUser = user;
    }
}
