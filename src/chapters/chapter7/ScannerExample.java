package chapters.chapter7;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please input full name");

        String fullname = scanner.nextLine();
        String[] fullnamearray = fullname.split(" ");
        System.out.println(fullnamearray[0]);
        System.out.println(fullnamearray[1]);
    }
}
