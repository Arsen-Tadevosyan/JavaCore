package HomeWorks.empoyee;

import works.library.Book;

public class EmpoyeeStorage {

    private Empoyee[] empoyees = new Empoyee[10];
    private int size;

    public void add(Empoyee empoyee) {
        if (size == empoyees.length) {
            extend();
        }
        empoyees[size++] = empoyee;
    }

    private void extend() {
        Empoyee[] tmp = new Empoyee[empoyees.length + 10];
        System.arraycopy(empoyees, 0, tmp, 0, empoyees.length);
        empoyees = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(empoyees[i].getName() + " " + empoyees[i].getSurname() + " " + empoyees[i].getEmpoyeeID() + " " + empoyees[i].getSalary() + " " + empoyees[i].getCompany() + " " + empoyees[i].getPosition());
        }
    }

    public void searchID(String ky) {
        for (int i = 0; i < size; i++) {
            if (empoyees[i].getEmpoyeeID().contains(ky))
                System.out.println(empoyees[i].getName() + " " + empoyees[i].getSurname() + " " + empoyees[i].getEmpoyeeID() + " " + empoyees[i].getSalary() + " " + empoyees[i].getCompany() + " " + empoyees[i].getPosition());
        }
    }

    public void searchCompanyName(String kyw) {
        for (int i = 0; i < size; i++) {
            if (empoyees[i].getCompany().contains(kyw))
                System.out.println(empoyees[i].getName() + " " + empoyees[i].getSurname() + " " + empoyees[i].getEmpoyeeID() + " " + empoyees[i].getSalary() + " " + empoyees[i].getCompany() + " " + empoyees[i].getPosition());
        }
    }
}
