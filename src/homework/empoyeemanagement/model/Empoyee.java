package homework.empoyeemanagement.model;

import homework.empoyeemanagement.util.DateUtil;

import java.util.Date;

public class Empoyee {

    private String id;
    private String name;
    private String surname;
    private String phone;
    private double salary;
    private String position;
    private Company company;
    private Date dateOfBirthay;
    private Date registerDate;

    public Empoyee(String id, String name, String surname, String phone, double salary, String position, Company company, Date dateOfBirthay, Date registerDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.salary = salary;
        this.position = position;
        this.company = company;
        this.dateOfBirthay = dateOfBirthay;
        this.registerDate = registerDate;
    }

    public Date getDateOfBirthay() {
        return dateOfBirthay;
    }

    public void setDateOfBirthay(Date dateOfBirthay) {
        this.dateOfBirthay = dateOfBirthay;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Empoyee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Empoyee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", company=" + company +
                ", dateOfBirthay=" + DateUtil.dateToString(dateOfBirthay) +
                ", registerDate=" + DateUtil.dateToString(registerDate) +
                '}';
    }
}
