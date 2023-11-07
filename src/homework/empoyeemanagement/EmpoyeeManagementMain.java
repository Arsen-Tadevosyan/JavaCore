package homework.empoyeemanagement;

import homework.empoyeemanagement.exception.EmployeeNotFoundException;
import homework.empoyeemanagement.model.Company;
import homework.empoyeemanagement.model.Empoyee;
import homework.empoyeemanagement.storage.CompanyStorage;
import homework.empoyeemanagement.storage.EmpoyeeStorage;
import homework.empoyeemanagement.util.DateUtil;
import homework.empoyeemanagement.util.StorageSerializeUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;


public class EmpoyeeManagementMain implements Command {
    private static Scanner scanner = new Scanner(System.in);
    private static EmpoyeeStorage empoyeeStorage = StorageSerializeUtil.deserializeEmployeeStorage();
    private static CompanyStorage companyStorage = StorageSerializeUtil.deserializeCompanyStorage();


    public static void main(String[] args) throws ParseException {
        boolean isRun = true;

        while (isRun) {
            Command.printLoginComands();
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
                    System.out.println("Wrong command.");
            }

        }

        while (isRun) {
            Command.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_COMPAMY:
                    addCompany();
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_ALL_COMPANIES:
                    companyStorage.print();
                    break;
                case PRINT_ALL_EMPLOYEES:
                    empoyeeStorage.print();
                    break;
                case SEARCH_EMPLYOEE_BY_ID:
                    searchEmployeeById();
                    break;
                case SEARCH_EMPLYOEE_BY_COMPANY:
                    searchEmployeeByCompany();
                    break;
                case DELETE_COMPANY:
                    deleteCompany();
                    break;
                case DELETE_EMPLOYEE:
                    deleteEmployee();
                    break;
                case CHANGE_COMPANY:
                    changeCompany();
                    break;
                case CHANGE_EMPLOYEE:
                    changeEmployee();
                    break;
                default:
                    System.out.println("invalite command. try again!");
            }
        }
    }

    private static void register() {
//TODO
    }

    private static void login() throws ParseException {
        System.out.println("please input name");
        String email = scanner.nextLine();
        System.out.println("please input password");
        String password = scanner.nextLine();
        if (email.equals("admin@gmail.com") && password.equals("12345")) {
            userComands();
        } else {
            System.out.println("invalid email or password Please try again");
        }
    }

    private static void userComands() throws ParseException {
        boolean isRun = true;
        Command.printCommands();
        String command = scanner.nextLine();
        switch (command) {
            case EXIT:
                isRun = false;
                break;
            case ADD_COMPAMY:
                addCompany();
                break;
            case ADD_EMPLOYEE:
                addEmployee();
                break;
            case PRINT_ALL_COMPANIES:
                companyStorage.print();
                break;
            case PRINT_ALL_EMPLOYEES:
                empoyeeStorage.print();
                break;
            case SEARCH_EMPLYOEE_BY_ID:
                searchEmployeeById();
                break;
            case SEARCH_EMPLYOEE_BY_COMPANY:
                searchEmployeeByCompany();
                break;
            case DELETE_COMPANY:
                deleteCompany();
                break;
            case DELETE_EMPLOYEE:
                deleteEmployee();
                break;
            case CHANGE_COMPANY:
                changeCompany();
                break;
            case CHANGE_EMPLOYEE:
                changeEmployee();
                break;
            default:
                System.out.println("invalite command. try again!");
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

        Empoyee employeeFromStorage = null;
        try {
            employeeFromStorage = empoyeeStorage.getById(employeeId);
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
            StorageSerializeUtil.serializeEmployeeStorage(empoyeeStorage);
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("wrong salary ,please input only numbers!");
        }

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
        StorageSerializeUtil.serializeCompanyStorage(companyStorage);
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
        try {
            Empoyee employeeFromStorage = empoyeeStorage.getById(employeeId);
            if (employeeFromStorage.getCompany().equals(companyFromStorage)) {
                System.out.println("Wrong employe id");
                return;
            }
            empoyeeStorage.deleteById(employeeId);
            StorageSerializeUtil.serializeEmployeeStorage(empoyeeStorage);
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }
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
        StorageSerializeUtil.serializeCompanyStorage(companyStorage);
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
        try {
            System.out.println(empoyeeStorage.getById(employeeId));
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void addEmployee() throws ParseException {
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
        boolean exists;
        try {
            empoyeeStorage.getById(employeeId);
            exists = true;
        } catch (EmployeeNotFoundException e) {
            exists = false;
        }
        if (!exists) {
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
            System.out.println("please input employee date of birthay  (dd-MM-yyyy)");
            String dateOfBirthayStr = scanner.nextLine();
            Date dateOfBirthay = DateUtil.StringToDate(dateOfBirthayStr);
            Date registerDate = new Date();
            Empoyee empoyee = new Empoyee(employeeId, employeeName, emoloyeeSurname, emoloyeePhone,
                    emoloyeesalary, emoloyeePosition, companyFromStorage, dateOfBirthay, registerDate);
            empoyeeStorage.add(empoyee);
            StorageSerializeUtil.serializeEmployeeStorage(empoyeeStorage);
            System.out.println("Employee registred!");
        } else {
            System.out.println(" employee already exists");
        }
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
        StorageSerializeUtil.serializeCompanyStorage(companyStorage);
        System.out.println("company resgistred");
    }
}
