package trials.banking.model;

import trials.banking.deals.Deal;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class User {
    String name;
    String surname;
    int age;
    String phone_number;
    String email;
    String password;
   List<Deal>  deals;

    public User(String name, String surname, int age, String phone_number, String email, String password, List<Deal> deals) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone_number = phone_number;
        this.email = email;
        this.password = password;
        this.deals = deals;
    }

    public User() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Deal> getDeals() {
        return deals;
    }

    public void setDeals(List<Deal> deals) {
        this.deals = deals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(phone_number, user.phone_number) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(deals, user.deals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, phone_number, email, password, deals);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", deals=" + deals +
                '}';
    }
}
