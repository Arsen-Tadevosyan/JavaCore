package homework.empoyeemanagement.util;

import homework.empoyeemanagement.storage.CompanyStorage;
import homework.empoyeemanagement.storage.EmpoyeeStorage;

import java.io.*;

public class StorageSerializeUtil {
    private static final String COMPANY_FILE_PATH = "C:\\Users\\User\\IdeaProjects\\JavaCore\\src\\homework\\empoyeemanagement\\data\\CompanyStorage.dat";
    private static final String EMPLOYEE_FILE_PATH = "C:\\Users\\User\\IdeaProjects\\JavaCore\\src\\homework\\empoyeemanagement\\data\\EmploeeStyoage.dat";

    public static void serializeCompanyStorage(CompanyStorage companyStorage) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(COMPANY_FILE_PATH))) {
            outputStream.writeObject(companyStorage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void serializeEmployeeStorage(EmpoyeeStorage empoyeeStorage) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(EMPLOYEE_FILE_PATH))) {
            outputStream.writeObject(empoyeeStorage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CompanyStorage deserializeCompanyStorage() {
        File file = new File(COMPANY_FILE_PATH);
        if (!file.exists()) {
            return new CompanyStorage();
        }
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(COMPANY_FILE_PATH))) {
            Object o = inputStream.readObject();
            if (o instanceof CompanyStorage companyStorage) {
                return companyStorage;
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new CompanyStorage();
    }

    public static EmpoyeeStorage deserializeEmployeeStorage() {
        File file = new File(EMPLOYEE_FILE_PATH);
        if (!file.exists()) {
            return new EmpoyeeStorage();
        }
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(EMPLOYEE_FILE_PATH))) {
            Object o = inputStream.readObject();
            if (o instanceof EmpoyeeStorage empoyeeStorage) {
                return empoyeeStorage;
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new EmpoyeeStorage();
    }

}
