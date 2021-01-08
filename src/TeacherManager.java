import java.util.List;

public class TeacherManager {
    List<Teacher> teacherList;

    public TeacherManager(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public static final String FILE_TEACHER = "teacher.dat";
    public void addNewTeacher(Teacher teacher){
        teacherList.add(teacher);
        ReadAndWriteFile.readFile(FILE_TEACHER);
    }
    public void showAll(){
        teacherList =(List<Teacher>) ReadAndWriteFile.readFile(FILE_TEACHER);
        for (Teacher teacher: teacherList) {
            System.out.println(teacher);
        }
    }
    public void showTeacherBySalaryGrate(){
        double maxSalary = 0;
        for (Teacher teacher : teacherList){
            double salary = teacher.getSalary();
            if(salary>maxSalary){
                System.out.println(teacher);
            }
        }
    }
    public void readFile(){
        teacherList = (List<Teacher>) ReadAndWriteFile.readFile(FILE_TEACHER);
        showAll();
    }
}
