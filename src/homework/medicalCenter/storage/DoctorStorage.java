package homework.medicalCenter.storage;

import homework.medicalCenter.model.Doctor;


public class DoctorStorage {
    private Doctor[] doctors = new Doctor[10];
    private int size;

    public Doctor getById(String Id) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(Id)) {
                return doctors[i];
            }
        }
        return null;
    }

    public Doctor getByProf(String prof) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfesion().equals(prof)) {
                return doctors[i];
            }
        }
        return null;
    }

    public void add(Doctor doctor) {
        if (size == doctors.length) {
            extend();
        }
        doctors[size++] = doctor;
    }

    public void extend() {
        Doctor[] tmp = new Doctor[doctors.length];
        System.arraycopy(doctors, 0, tmp, 0, size);
        doctors = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(doctors[i]);
        }
    }

    public void deleteById(String id) {
        int indexById = getIndexById(id);
        if (indexById == -1) {
            System.out.println("doctor does not exists!");
            return;
        }
        for (int i = indexById; i < size; i++) {
            doctors[i] = doctors[i + 1];
        }
        size--;
    }

    private int getIndexById(String id) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}

