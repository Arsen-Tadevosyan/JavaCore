package works.compare;

import java.util.Date;
import java.util.Objects;

public class Student {

    private String name;
    private String surname;
    private int age;
    private Date registerdate;

    public Student(String name, String surname, int age, Date registerdate) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.registerdate = registerdate;
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

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(registerdate, student.registerdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, registerdate);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", registerdate=" + registerdate +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        if (o.age > age) {
//            return -1;
//        } else if (o.age < age) {
//            return 1;
//        }
//        return 0;


//        return name.compareTo(o.name);


//        return registerdate.compareTo(o.registerdate);
//    }

}
