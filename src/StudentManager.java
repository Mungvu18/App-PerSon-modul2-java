
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManager {
    List<Student> studentList;

    public StudentManager(List<Student> studentList) {
        this.studentList = studentList;
    }
    public static final String FILE_NAME = "Student.txt";
    public void addNewStudent(Student student) {
        studentList.add(student);
        ReadAndWriteFile.writeFile(FILE_NAME, studentList);
    }

    public void showAll(List<Student> studentList) {
//        studentList=(List<Student>) ReadAndWriteFile.readFile(FILE_NAME);
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public void showStudentHaveMarkAvgBiggestAndSmallLess() {
        sortStudentByMark(studentList);
        Student studentMarkMax = studentList.get(0);
        Student studentMarkMin = studentList.get(studentList.size()-1);
        System.out.println("MarkAvg max is: " + studentMarkMax.getMarkAvg());
        System.out.println("MarkAvg min is: " + studentMarkMin.getMarkAvg());
    }

    public void sortStudentByMark(List<Student> list) {
        Collections.sort(list, ((o1, o2) -> {
            if (o1.getMarkAvg() > o2.getMarkAvg()) return 1;
            if (o2.getMarkAvg() > o1.getMarkAvg()) return -1;
            else return 0;
        }));
    }
    public void findStudentById(String idNeedFind){
        for (Student student: studentList) {
            String studentId = student.getStudentId();
            boolean testId = studentId.equalsIgnoreCase(idNeedFind);
            if(testId){
                System.out.println(student);
                return;
            }
        }
        System.out.println("Not exits studentId you find");
    }
    public void sortByName(){
        Collections.sort(studentList);
        showAll(studentList);
    }
    public List<Student> testScholarship(){
        List<Student> scholarshipList = new ArrayList<>();
        for (Student student: studentList) {
            if(student.getMarkAvg()>8){
                scholarshipList.add(student);
            }
        }
        return scholarshipList;
    }
    public void showStudentHaveScholarship(){
        List<Student> scholarshipList = testScholarship();
        sortStudentByMark(scholarshipList);
        if (scholarshipList!=null){
           showAll(scholarshipList);
        } else System.out.println("Not have student have scholarship");
    }
    public void readFile(){
        studentList = (List<Student>)  ReadAndWriteFile.readFile(FILE_NAME);
        showAll(studentList);
    }
}
