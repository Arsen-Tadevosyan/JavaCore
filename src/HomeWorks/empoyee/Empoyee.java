package HomeWorks.empoyee;

public class Empoyee {
    private String name;
    private String surname;
    private String empoyeeID;
    private double salary;
    private String company;
    private String position;

    public Empoyee() {

    }

    public Empoyee(String name, String surname, String empoyeeID, double salary, String company, String position) {
        this.name = name;
        this.surname = surname;
        this.empoyeeID = empoyeeID;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmpoyeeID() {
        return empoyeeID;
    }

    public void setEmpoyeeID(String empoyeeID) {
        this.empoyeeID = empoyeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
