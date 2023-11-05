package homework.onlineMarket;

import homework.onlineMarket.Commads;
import homework.onlineMarket.enums.EnumForPaymentMethod;
import homework.onlineMarket.enums.EnumForProduct;
import homework.onlineMarket.enums.EnumForStatus;
import homework.onlineMarket.enums.EnumForUser;
import homework.onlineMarket.model.Order;
import homework.onlineMarket.model.Product;
import homework.onlineMarket.model.User;
import homework.onlineMarket.storage.StorageOrder;
import homework.onlineMarket.storage.StorageProduct;
import homework.onlineMarket.storage.StorageUser;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

import static homework.onlineMarket.Commads.CHANEL_ORDER_BY_ID;
import static homework.onlineMarket.Commads.PRINT_MY_ORDERs;


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
                    System.out.println(" invalid command. try again");
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
                if (userFromStorage.getType().equals(EnumForUser.USER)) {
                    commandForUser();
                } else {
                    commandForAdmin();
                }
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
        if (user.getType().equals(EnumForUser.USER)) {
            commandForUser();
        } else {
            commandForAdmin();
        }
    }

    private static void commandForAdmin() {
        boolean isRun = true;
        while (isRun) {
            Commads.printCommandsByAdmin();
            String command = scanner.nextLine();
            switch (command) {
                case LOGOUT:
                    currentUser = null;
                    isRun = false;
                    break;
                case ADD_PRODUCT:
                    addProduct();
                    break;
                case REMOVE_PRODUCT_BY_ID:
                    removedProductById();
                    break;
                case PRINT_PRODUCTS:
                    storageProduct.printAllProduct();
                    break;
                case PRINT_USERS:
                    storageUser.printOnlyUsers();
                    break;
                case PRINT_ORDERS:
                    storageOrder.print();
                    break;
                case CHANGE_ORDER_STATUS:
                    changeOrderStatus();
                    break;
                default:
                    System.out.println("invalid command try again");
            }
        }
    }

    private static void changeOrderStatus() {
        storageOrder.print();
        System.out.println("please choois id");
        String id = scanner.nextLine();
        Order orderFromStorage = storageOrder.getById(id);
        if (orderFromStorage == null) {
            System.out.println("order with " + id + " dose not exists");
            return;
        }
        System.out.println("please input new order status " +
                " NEW, DELIVERED or CANCELED");
        String status = scanner.nextLine();
        EnumForStatus enumForStatus;
        try {
            enumForStatus = EnumForStatus.valueOf(status.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("wrong answer");
            return;
        }
        orderFromStorage.setOrderStatus(enumForStatus);
        if (enumForStatus == EnumForStatus.DELIVERED) {
            int qty = orderFromStorage.getQty();
            orderFromStorage.getProduct().setStockQty
                    (orderFromStorage.getProduct().getStockQty() - qty);
        }
        System.out.println("status changed");
    }

    private static void removedProductById() {
        storageProduct.printAllProduct();
        System.out.println("please choois id");
        String id = scanner.nextLine();
        Product productFromStorage = storageProduct.getById(id);
        if (productFromStorage == null) {
            System.out.println("product with " + id + " dose not exists!");
        }
        storageProduct.deleteProductById(id);
        System.out.println("product is removed");
    }

    private static void addProduct() {
        String uuid = UUID.randomUUID().toString();
        String[] uuids = uuid.split("-");
        String id = uuids[0];
        System.out.println("please input name product");
        String productName = scanner.nextLine();
        System.out.println("please input description");
        String description = scanner.nextLine();
        System.out.println("please input price");
        String price = scanner.nextLine();
        System.out.println("please input stockQty");
        int stockQty = 0;
        try {
            stockQty = Integer.parseInt(scanner.nextLine());
        } catch (IllegalArgumentException e) {
            System.out.println("wrong argument");
            return;
        }
        System.out.println("please input type " +
                "ELECTRONICS,CLOTHING or BOOKS");
        String type = scanner.nextLine();
        EnumForProduct enumForProduct;
        try {
            enumForProduct = EnumForProduct.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("wrong answer");
            return;
        }
        Product product = new Product(id, productName, description,
                price, stockQty, enumForProduct);
        storageProduct.add(product);
        System.out.println("product registred");
    }

    private static void commandForUser() {
        boolean isRun = true;
        while (isRun) {
            Commads.printCommandsByUser();
            String command = scanner.nextLine();
            switch (command) {
                case LOGOUt:
                    currentUser = null;
                    isRun = false;
                    break;
                case PRINT_ALL_PRODUCTS:
                    storageProduct.printAllProduct();
                    break;
                case BUY_PRODUCT:
                    buyProduct();
                    break;
                case PRINT_MY_ORDERs:
                    storageOrder.printByUser(currentUser);
                    break;
                case CHANEL_ORDER_BY_ID:
                    chanelOrderById();
                    break;
                default:
                    System.out.println("invalid command try again");
            }
        }
    }

    private static void chanelOrderById() {
        storageOrder.printByUser(currentUser);
        System.out.println("please choose order id");
        String id = scanner.nextLine();
        Order orderfromStorage = storageOrder.getById(id);
        if (orderfromStorage == null) {
            System.out.println("wrong choose");
            return;
        }
        storageOrder.deleteOrdeerById(id);
        System.out.println("Order is canceled");
    }

    private static void buyProduct() {
        storageProduct.printAllProduct();
        System.out.println("please choois product id");
        String id = scanner.nextLine();
        Product productFromStorage = storageProduct.getById(id);
        if (productFromStorage == null) {
            System.out.println(" wrong answer ");
            return;
        }
        System.out.println("please input quantity product");
        String quantity = scanner.nextLine();
        int Quantity = Integer.parseInt(quantity);
        if (productFromStorage.getStockQty() < Quantity) {
            System.out.println("There are currently no products in this quantity");
            return;
        }
        System.out.println("please input payMethod");
        String payMethod = scanner.nextLine();
        EnumForPaymentMethod enumForPaymentMethod;
        try {
            enumForPaymentMethod = EnumForPaymentMethod.valueOf(payMethod.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("wrong answer");
            return;
        }
        int price = Integer.parseInt(productFromStorage.getPrice());
        int quantityPrice = price * Quantity;
        String QuantityPrice = String.valueOf(quantityPrice);
        Order order = new Order(id, currentUser, productFromStorage, new Date(),
                QuantityPrice, EnumForStatus.NEW, Quantity, enumForPaymentMethod);
        storageOrder.add(order);
        System.out.println("order is ready");
    }


}