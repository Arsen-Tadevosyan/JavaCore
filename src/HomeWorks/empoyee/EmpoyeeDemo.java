package HomeWorks.empoyee;

import java.util.Scanner;

public class EmpoyeeDemo {
    public static void main(String[] args) {
        EmpoyeeStorage empoyeeStorage = new EmpoyeeStorage();
        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for add empoyee");
            System.out.println("Please input 2 for print all empoyee");
            System.out.println("Please input 3 for search empoyee by empoyee ID");
            System.out.println("Please input 4 for search empoyee by company name");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("please input name");
                    String name = scanner.nextLine();
                    System.out.println("please input surname");
                    String surname = scanner.nextLine();
                    System.out.println("please input ID");
                    String ID = scanner.nextLine();
                    System.out.println("please input salary");
                    double salary = Integer.parseInt(scanner.nextLine());
                    System.out.println("please input company");
                    String company = scanner.nextLine();
                    System.out.println("please input position");
                    String position = scanner.nextLine();
                    Empoyee empoyee = new Empoyee(name, surname, ID, salary, company, position);
                    empoyeeStorage.add(empoyee);
                    System.out.println(" Empoyee created!");
                    break;
                case "2":
                    System.out.println("----------------");
                    empoyeeStorage.print();
                    System.out.println("----------------");
                    break;
                case "3":
                    System.out.println("please input keyword");
                    String keyword = scanner.nextLine();
                    empoyeeStorage.searchID(keyword);
                    break;
                case "4":
                    System.out.println("please input keyword");
                    String kew = scanner.nextLine();
                    empoyeeStorage.searchCompanyName(kew);
                    break;
            }
        }
    }
}
