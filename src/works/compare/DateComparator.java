package works.compare;

import java.util.Comparator;

public class DateComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRegisterdate().compareTo(o2.getRegisterdate());
    }
}
