package works.compare;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CompareExample {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");
//        Set<Student> students = new TreeSet<>(new ageComparator());
        List<Student>students=new ArrayList<>();

        students.add(new Student("vzgo", "vzgoyan", 50, simpleDateFormat.parse("11-11-2000")));
        students.add(new Student("poxos", "vzgoyan", 70, simpleDateFormat.parse("07-09-2006")));
        students.add(new Student("aram", "vzgoyan", 4, simpleDateFormat.parse("04-11-2007")));

        students.sort(Comparator.comparing(Student::getSurname));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
