package homework.medicalCenter.model;

public class Doctor extends Person{
    private String email;
    private String profesion;


    public Doctor() {
    }

    public Doctor(String id, String name, String surname, String phone, String email, String profesion) {
        super(id, name, surname, phone);
        this.email = email;
        this.profesion = profesion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}
