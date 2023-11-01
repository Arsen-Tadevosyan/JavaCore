package chapters.chapter12;

import chapters.chapter12.anotation.FirstAnotation;
import chapters.chapter12.anotation.model;

@FirstAnotation
public class User {

    @FirstAnotation
    private String name;
    private String surname;
    private String email;
    private Language lang;

    @model(name = "user", val = 7)
    @FirstAnotation
    public User(String name, String surname, String email, Language lang) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.lang = lang;
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

    @FirstAnotation
    public String getEmail() {
        return email;
    }

    @FirstAnotation
    public void setEmail(String email) {
        this.email = email;
    }

    @FirstAnotation
    public Language getLang() {
        return lang;
    }

    public void setLang(Language lang) {
        this.lang = lang;
    }

    public static void printHello() {
        System.out.println("hello");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", lang='" + lang + '\'' +
                '}';
    }
}
