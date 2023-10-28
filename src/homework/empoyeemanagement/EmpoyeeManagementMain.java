package homework.empoyeemanagement;

import homework.empoyeemanagement.model.Company;
import homework.empoyeemanagement.model.Empoyee;
import homework.empoyeemanagement.storage.CompanyStorage;
import homework.empoyeemanagement.storage.EmpoyeeStorage;
import homework.empoyeemanagement.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmpoyeeManagementMain implements Command {
    private static Scanner scanner = new Scanner(System.in);
    private static EmpoyeeStorage empoyeeStorage = new EmpoyeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;

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
        System.out.println("please input employee date of birthay  (dd-MM-yyyy)");
        String dateOfBirthayStr = scanner.nextLine();
        Date dateOfBirthay = DateUtil.StringToDate(dateOfBirthayStr);
        Date registerDate = new Date();
        Empoyee empoyee = new Empoyee(employeeId, employeeName, emoloyeeSurname, emoloyeePhone,
                emoloyeesalary, emoloyeePosition, companyFromStorage, dateOfBirthay, registerDate);
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
}
