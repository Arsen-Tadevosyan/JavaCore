package chapters.chapter8.person;

public class DynamicDispatechTest {

    public static void main(String[] args) {
        Employee employee = new Employee();
        Student student = new Student();


        sendEmail(student);
        sendEmail(employee);
    }

    public static void sendEmail(Person person) {
        System.out.println("sending email to " + person.getEmail());
        person.printHello();
    }
}

