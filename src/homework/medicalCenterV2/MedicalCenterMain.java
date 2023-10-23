package homework.medicalCenterV2;

import chapters.chapter8.person.Person;
import homework.medicalCenterV2.Storage.PersonStorage;
import homework.medicalCenterV2.model.Doctor;
import homework.medicalCenterV2.model.Patient;
import homework.medicalCenterV2.util.DateUtil;

import java.text.ParseException;
import java.util.Date;

public class MedicalCenterMain {

    static PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) throws ParseException {
        Doctor doctor = new Doctor("55", "poxos", "poxosyan", "doctorgmail.com", "098765432", "dzox pchox");
        Doctor doctor1 = new Doctor("50", "poxosik", "poxosyanc", "doctorgmail.co", "098734432", "svarchik");
        personStorage.add(doctor);
        personStorage.add(doctor1);

        String appointmentDate = "19-10-2023 10:15";
        Date date = DateUtil.stringToDateTime(appointmentDate);

        Patient patient = new Patient("5434", "rafo", "frangulyan", "fro.gmail.com)", "76543", doctor, new Date(), date);
        personStorage.add(patient);

        String appointmentDate1 = "19-10-2023 10:00";
        Date date1 = DateUtil.stringToDateTime(appointmentDate);

        Patient patient1 = new Patient("5734", "rafoul", "frangulyan", "fro.gmail.com)", "76043", doctor, new Date(), date1);
        if (personStorage.isValidDate(doctor, date1)){
            personStorage.add(patient1);
        }

        System.out.println("doctors");
        personStorage.printDoctors();
        System.out.println("patients");
        personStorage.printPatients();
    }
}
