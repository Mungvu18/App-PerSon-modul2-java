import java.io.Serializable;

public class Student extends Person implements Comparable, Serializable {
    private String studentId;
    private double markAvg;
    private String email;

    public Student(String name, String gender, String birthday, String address, String studentId, double markAvg, String email) {
        super(name, gender, birthday, address);
        this.studentId = studentId;
        this.markAvg = markAvg;
        this.email = email;
    }



    public double getMarkAvg() {
        return markAvg;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "studentId='" + studentId + '\'' +
                ", markAvg=" + markAvg +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        return super.getName().compareTo(student.getName());
    }
}
