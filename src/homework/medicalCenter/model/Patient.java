package homework.medicalCenter.model;

public class Patient extends Person {
   private Doctor doctor;



    public Patient(String id, String name, String surname, String phone, Doctor doctor) {
        super(id, name, surname, phone);
        this.doctor = doctor;
    }

    public Patient() {
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
