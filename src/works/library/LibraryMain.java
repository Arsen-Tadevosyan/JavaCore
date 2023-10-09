package works.library;

import java.util.Scanner;

public class LibraryMain {
    static Scanner scanner = new Scanner(System.in);
    static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {


        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addBook();
                    break;
                case "2":
                    searchBook();
                    break;
                case "3":
                    printAllBook();
                    break;
                default:
                    System.out.println("invalid command. try again");
            }
        }
    }

    private static void printAllBook() {
        System.out.println("----------");
        bookStorage.print();
        System.out.println("----------");
    }

    private static void searchBook() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        bookStorage.searech(keyword);
    }

    private static void addBook() {
        System.out.println("please input book title");
        String title = scanner.nextLine();
        System.out.println("please input auter name");
        String autorname = scanner.nextLine();
        System.out.println("please input price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("please input count");
        int count = Integer.parseInt(scanner.nextLine());
        Book book = new Book(title, autorname, price, count);
        bookStorage.add(book);
        System.out.println("Book created!");
    }

    public static void printCommands() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for ADD BOOK");
        System.out.println("Please input 2 for SEARCH BOOK");
        System.out.println("Please input 3 for PRINT ALL BOOKS");

    }
}
