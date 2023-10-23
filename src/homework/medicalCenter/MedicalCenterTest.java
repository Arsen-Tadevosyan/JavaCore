package homework.medicalCenter;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.storage.DoctorStorage;
import homework.medicalCenter.storage.PatientStorage;

import java.util.Scanner;


public class MedicalCenterTest implements Command {
    static Scanner scanner = new Scanner(System.in);
    static PatientStorage patientStorage = new PatientStorage();
    static DoctorStorage doctorStorage = new DoctorStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Command.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESION:
                    searchDoctorByProf();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorData();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printPatentByDoctor();
                    break;
                case PRINT_ALL_PATIENTS:
                    printAllPatients();
                    break;
                default:
                    System.out.println(" invalite command. Try again");
            }
        }
    }

    private static void printAllPatients() {
        patientStorage.print();
    }

    private static void printPatentByDoctor() {
        System.out.println("please choose id");
        doctorStorage.print();
        String Id = scanner.nextLine();
        Doctor doctorfromStorage = doctorStorage.getById(Id);
        if (doctorfromStorage == null) {
            System.out.println("doctor with " + Id + " dose not exsists!");
            return;
        }
        patientStorage.printByDoctor(doctorfromStorage);

    }

    private static void addPatient() {
        System.out.println("Please input doctor id");
        doctorStorage.print();
        String id = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(id);
        if (doctorFromStorage == null) {
            System.out.println("doctor with " + id + " dose not exists!");
            return;
        }
        System.out.println("please input patent id");
        String patientId = scanner.nextLine();
        Patient PatientFromStorage = patientStorage.getById(patientId);
        if (PatientFromStorage != null) {
            System.out.println("employee with " + patientId + " id already exists");
            return;
        }
        System.out.println("Please input name");
        String name = scanner.nextLine();
        System.out.println("Please input surname");
        String surname = scanner.nextLine();
        System.out.println("Please input phone");
        String phone = scanner.nextLine();
        Patient patient = new Patient(patientId, name, surname, phone, doctorFromStorage);
        patientStorage.addPat(patient);
        System.out.println("Doctor registred");
    }

    private static void changeDoctorData() {
        System.out.println("please choose id");
        doctorStorage.print();
        String Id = scanner.nextLine();
        Doctor doctorDromStorage = doctorStorage.getById(Id);
        if (doctorDromStorage == null) {
            System.out.println("doctor with " + Id + " dose not exsists!");
            return;
        }
        System.out.println("please input new doctor name");
        String newName = scanner.nextLine();
        System.out.println("please input new doctor surname");
        String newSurname = scanner.nextLine();
        System.out.println("please input new doctor phone number");
        String newPhone = scanner.nextLine();
        System.out.println("please input new doctor email");
        String newEmail = scanner.nextLine();
        System.out.println("please input new doctor profesion");
        String newProfesion = scanner.nextLine();
        doctorDromStorage.setName(newName);
        doctorDromStorage.setSurname(newSurname);
        doctorDromStorage.setPhone(newPhone);
        doctorDromStorage.setEmail(newEmail);
        doctorDromStorage.setProfesion(newProfesion);
        System.out.println("Doctor updated!");
    }

    private static void deleteDoctorById() {
        System.out.println("please choose id");
        doctorStorage.print();
        String Id = scanner.nextLine();
        Doctor doctorDromStorage = doctorStorage.getById(Id);
        if (doctorDromStorage == null) {
            System.out.println("doctor with " + Id + " dose not exsists!");
            return;
        }
        doctorStorage.deleteById(Id);
        System.out.println("doctor deletet");
    }

    private static void searchDoctorByProf() {
        System.out.println("please input profesion");
        String profesin = scanner.nextLine();
        Doctor getProf = doctorStorage.getByProf(profesin);
        if (getProf == null) {
            System.out.println("not a doctor");
        } else {
            System.out.println(getProf);
        }
    }

    private static void addDoctor() {
        System.out.println("Please input id");
        String id = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(id);
        if (doctorFromStorage != null) {
            System.out.println("doctor with " + id + " already exists!");
            return;
        }
        System.out.println("Please input name");
        String name = scanner.nextLine();
        System.out.println("Please input surname");
        String surname = scanner.nextLine();
        System.out.println("Please input phone");
        String phone = scanner.nextLine();
        System.out.println("Please input email");
        String email = scanner.nextLine();
        System.out.println("Please input position");
        String profesion = scanner.nextLine();
        System.out.println("Doctor registred");
        Doctor doctor = new Doctor(id, name, surname, phone, email, profesion);
        doctorStorage.add(doctor);
    }
}
