package homework.medicalCenterV2.model;

import java.util.Date;

public class Patient extends Person {

    private Doctor doctor;
    private Date registerDate;
    private Date appointmentDateTame;

    public Patient(String id, String name, String surname, String email, String phone, Doctor doctor, Date registerDatr, Date appointmentDateTame) {
        super(id, name, surname, email, phone);
        this.doctor = doctor;
        this.registerDate = registerDatr;
        this.appointmentDateTame = appointmentDateTame;
    }

    public Patient() {
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getRegisterDatr() {
        return registerDate;
    }

    public void setRegisterDatr(Date registerDatr) {
        this.registerDate = registerDatr;
    }

    public Date getAppointmentDateTame() {
        return appointmentDateTame;
    }

    public void setAppointmentDateTame(Date appointmentDateTame) {
        this.appointmentDateTame = appointmentDateTame;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "doctor=" + doctor +
                ", registerDate=" + registerDate +
                ", appointmentDateTame=" + appointmentDateTame +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
