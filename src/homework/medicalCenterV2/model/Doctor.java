package homework.medicalCenterV2.model;

public class Doctor extends Person{
    private String profesion;

    public Doctor(String id, String name, String surname, String email, String phone, String profesion) {
        super(id, name, surname, email, phone);
        this.profesion = profesion;
    }

    public Doctor() {
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "profesion='" + profesion + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
