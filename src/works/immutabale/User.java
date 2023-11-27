package works.immutabale;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public  final class User {
    private final String name;
    private final String surname;
    private final String email;
    private final String password;
    private final List<String> languageList;

    public User(String name, String surname, String email, String password,List<String>languageList) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.languageList=new ArrayList<>(languageList);
    }

    public List<String> getLanguageList() {
        return new ArrayList<>(languageList);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(languageList, user.languageList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, password, languageList);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", languageList=" + languageList +
                '}';
    }
}
