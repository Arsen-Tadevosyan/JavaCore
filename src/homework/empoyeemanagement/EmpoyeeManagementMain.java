package homework.empoyeemanagement;

import java.util.Scanner;

public class EmpoyeeManagementMain {
    private static Scanner scanner = new Scanner(System.in);
    private static EmpoyeeStorage empoyeeStorage = new EmpoyeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();

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
                    addCompany();
                    break;
                case "2":
                    addEmployee();
                    break;
                case "3":
                    companyStorage.print();
                    break;
                case "4":
                    empoyeeStorage.print();
                    break;
                case "5":
                    searchEmployeeById();
                    break;
                case "6":
                    searchEmployeeByCompany();
                    break;
                case "7":
                    deleteCompany();
                    break;
                case "8":
                    deleteEmployee();
                    break;
                case "9":
                    changeCompany();
                    break;
                case "10":
                    changeEmployee();
                    break;
                default:
                    System.out.println("invalite command. try again!");
            }
        }
    }

    private static void changeEmployee() {
        System.out.println("please choose company id");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyId + " does not exists!");
            return;
        }
        empoyeeStorage.searchEmployeByCompany(companyFromStorage);
        System.out.println("please input employee id");
        String employeeId = scanner.nextLine();
        Empoyee employeeFromStorage = empoyeeStorage.getById(employeeId);
        if (employeeFromStorage == null) {
            System.out.println("employee with " + employeeId + "id does not exists");
            return;
        }
        System.out.println("please input employee name");
        String employeeName = scanner.nextLine();
        System.out.println("please input employee surname");
        String emoloyeeSurname = scanner.nextLine();
        System.out.println("please input employee phone ");
        String emoloyeePhone = scanner.nextLine();
        System.out.println("please input employee  position");
        String emoloyeePosition = scanner.nextLine();
        System.out.println("please input employee  salary");
        double emoloyeesalary = Double.parseDouble(scanner.nextLine());
        employeeFromStorage.setName(employeeName);
        employeeFromStorage.setSurname(emoloyeeSurname);
        employeeFromStorage.setPosition(emoloyeePosition);
        employeeFromStorage.setSalary(emoloyeesalary);
        employeeFromStorage.setPhone(emoloyeePhone);
        System.out.println("Employee updated!");
    }


    private static void changeCompany() {
        System.out.println("please input company id");
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyId + " already exists!");
            return;
        }
        System.out.println("please input new company name");
        String companyName = scanner.nextLine();
        System.out.println("please input new company address");
        String companyAddress = scanner.nextLine();
        companyFromStorage.setName(companyName);
        companyFromStorage.setAddress(companyAddress);
        System.out.println("company updated!");
    }

    private static void deleteEmployee() {
        System.out.println("please choose company id");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyId + " does not exists!");
            return;
        }
        empoyeeStorage.searchEmployeByCompany(companyFromStorage);

        System.out.println("please input employee id");
        String employeeId = scanner.nextLine();
        Empoyee employeeFromStorage = empoyeeStorage.getById(employeeId);
        if (employeeFromStorage == null) {
            System.out.println("employee dose not exists");
            return;
        }
        if (employeeFromStorage.getCompany().equals(companyFromStorage)) {
            System.out.println("Wrong employe id");
            return;
        }
        empoyeeStorage.deleteById(employeeId);

    }

    private static void deleteCompany() {
        System.out.println("please choose company id");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyId + " does not exists!");
            return;
        }
        companyStorage.deleteById(companyId);
    }

    private static void searchEmployeeByCompany() {
        System.out.println("please choose company id");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyId + " does not exists!");
            return;
        }
        empoyeeStorage.searchEmployeByCompany(companyFromStorage);
    }

    private static void searchEmployeeById() {
        System.out.println("please input employee id");
        String employeeId = scanner.nextLine();
        Empoyee byId = empoyeeStorage.getById(employeeId);
        if (byId == null) {
            System.out.println("employee dose not exists");
        } else {
            System.out.println(byId);
        }
    }

    private static void addEmployee() {
        System.out.println("please choose company id");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyId + " does not exists!");
            return;
        }
        System.out.println("please input employee id");
        String employeeId = scanner.nextLine();
        Empoyee employeeFromStorage = empoyeeStorage.getById(employeeId);
        if (employeeFromStorage != null) {
            System.out.println("employee with " + employeeId + "id already exists");
            return;
        }
        System.out.println("please input employee name");
        String employeeName = scanner.nextLine();
        System.out.println("please input employee surname");
        String emoloyeeSurname = scanner.nextLine();
        System.out.println("please input employee phone ");
        String emoloyeePhone = scanner.nextLine();
        System.out.println("please input employee  position");
        String emoloyeePosition = scanner.nextLine();
        System.out.println("please input employee  salary");
        double emoloyeesalary = Double.parseDouble(scanner.nextLine());
        Empoyee empoyee = new Empoyee(employeeId, employeeName, emoloyeeSurname, emoloyeePhone, emoloyeesalary, emoloyeePosition, companyFromStorage);
        empoyeeStorage.add(empoyee);
        System.out.println("Employee registred!");
    }

    private static void addCompany() {
        System.out.println("please input company id");
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage != null) {
            System.out.println("Company with " + companyId + " already exists!");
            return;
        }
        System.out.println("please input company name");
        String companyName = scanner.nextLine();
        System.out.println("please input company address");
        String companyAddress = scanner.nextLine();
        Company company = new Company(companyId, companyName, companyAddress);
        companyStorage.add(company);
        System.out.println("company resgistred");
    }


    private static void printCommands() {

        System.out.println("Please input 0 for EXIT");
        System.out.println("Plesae input 1 for ADD_COMPANY");
        System.out.println("Plesae input 2 for ADD_EMPLOYEE");
        System.out.println("Plesae input 3 for PRINT_ALL_COMPANIES");
        System.out.println("Plesae input 4 for PRINT_ALL_EMPLOYEES");
        System.out.println("Plesae input 5 for SEARCH_EMPLYOEE_BY_ID");
        System.out.println("Plesae input 6 for SEARCH_EMPLYOEE_BY_COMPANY");
        System.out.println("Plesae input 7 for DELETE_COMPANY");
        System.out.println("Plesae input 8 for DELETE_EMPLOYEE");
        System.out.println("Plesae input 9 for CHANGE_COMPANY");
        System.out.println("Plesae input 10 for CHANGE_EMPLOYEE");

    }
}
