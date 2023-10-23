package chapters.chapter8.person;

public class Student extends Person{
    private String studentId;
    private double score;

    public Student(String name, String surname, String email, String phone, String studentId) {
        super(name, surname, email, phone);
        this.studentId = studentId;
    }

    public Student() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public void printHello() {
        System.out.println("barev");
    }
}
