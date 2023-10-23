package homework.medicalCenterV2.Storage;

import homework.medicalCenterV2.model.Doctor;
import homework.medicalCenterV2.model.Patient;
import homework.medicalCenterV2.model.Person;

import java.util.Calendar;
import java.util.Date;


public class PersonStorage {
    private Person[] people = new Person[10];
    private int size;

    public void add(Person person) {
        if (size == people.length) {
            extend();
        }
        people[size++] = person;
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Doctor) {
                System.out.println(people[i]);
            }
        }
    }


    public boolean isValidDate(Doctor doctor, Date appointmantDateTime) {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient) {
                if (((Patient) people[i]).getDoctor().getId().equals(doctor.getId())) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(appointmantDateTime);
                    calendar.add(Calendar.MINUTE, 29);
                    Date appointmeunDatePlus30Min = calendar.getTime();
                    if (appointmantDateTime.before(appointmeunDatePlus30Min)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void printPatients() {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient) {
                System.out.println(people[i]);
            }
        }
    }

    public void extend() {
        Person[] tmp = new Person[people.length + 10];
        System.arraycopy(people, 0, tmp, 0, size);
        people = tmp;

    }
}