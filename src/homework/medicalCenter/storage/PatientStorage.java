package homework.medicalCenter.storage;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;

public class PatientStorage {
    private Patient[] patients = new Patient[10];
    private int size;

    public void printByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor().equals(doctor)) {
                System.out.println(patients[i]);
            }
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(patients[i]);
        }
    }

    public void extend() {
        Patient[] tmp = new Patient[patients.length];
        System.arraycopy(patients, 0, tmp, 0, size);
        patients = tmp;
    }

    public void addPat(Patient patient) {
        if (size == patients.length) {
            extend();
        }
        patients[size++] = patient;
    }

    public Patient getByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor().equals(doctor)) {
                return patients[i];
            }
        }
        return null;
    }

    public Patient getById(String Id) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getId().equals(Id)) {
                return patients[i];
            }
        }
        return null;
    }
}
