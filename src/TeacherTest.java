
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherTest {
    static Scanner sc = new Scanner(System.in);
    static List<Teacher> teacherList = (List<Teacher>) ReadAndWriteFile.readFile(TeacherManager.FILE_TEACHER);
    static TeacherManager teacherManager = new TeacherManager(teacherList);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1.Thêm đối tượng giáo viên");
            System.out.println("2.Hiển thị tất cả thông tin giảng viên");
            System.out.println("3.Hiển thị giảng viên có lương cao nhất");
            System.out.println("4.Đọc file");
            System.out.println("0.Thoát chương trình");
            System.out.println("Nhập lựa chọn choice");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Teacher teacher = SetInForObject.setInForTeacher();
                    teacherManager.addNewTeacher(teacher);
                    break;
                case 2:
                    teacherManager.showAll();
                    break;
                case 3:
                    teacherManager.showTeacherBySalaryGrate();
                    break;
                case 4:
                    teacherManager.readFile();
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
            }
        } while (choice != 0);
    }
}
