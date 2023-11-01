package homework.empoyeemanagement.storage;

import homework.empoyeemanagement.exception.EmployeeNotFoundException;
import homework.empoyeemanagement.model.Company;
import homework.empoyeemanagement.model.Empoyee;

public class EmpoyeeStorage {
    private Empoyee[] empoyees = new Empoyee[10];
    private int size;


    public void add(Empoyee empoyee) {
        if (size == empoyees.length) {
            extend();
        }
        empoyees[size++] = empoyee;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(empoyees[i]);
        }
    }

    private void extend() {
        Empoyee[] tmp = new Empoyee[empoyees.length + 10];
        System.arraycopy(empoyees, 0, tmp, 0, size);
        empoyees = tmp;
    }

    public Empoyee getById(String employeeId) throws EmployeeNotFoundException {
        for (int i = 0; i < size; i++) {
            if (empoyees[i].getId().equals(employeeId)) {
                return empoyees[i];
            }
        }
       throw new EmployeeNotFoundException("employee with"+employeeId+" dose not exists!");
    }

    public void searchEmployeByCompany(Company companyFromStorage) {
        for (int i = 0; i < size; i++) {
            if (empoyees[i].getCompany().equals(companyFromStorage)) {
                System.out.println(empoyees[i]);
            }
        }
    }

    public void deleteById(String companyId) {
        int indexById = getIndexById(companyId);
        if (indexById == -1) {
            System.out.println("employee does not exists!");
            return;
        }
        for (int i = indexById; i < size; i++) {
            empoyees[i - 1] = empoyees[i];
        }
        size--;
    }


    private int getIndexById(String companyId) {
        for (int i = 0; i < size; i++) {
            if (empoyees[i].getId().equals(companyId)) {
                return i;
            }
        }
        return -1;
    }
}
