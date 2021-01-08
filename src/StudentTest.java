import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    static Scanner sc = new Scanner(System.in);
    static List<Student> studentList = (List<Student>) ReadAndWriteFile.readFile(StudentManager.FILE_NAME);
    static StudentManager studentManager = new StudentManager(studentList);

    public static void main(String[] args) {
        int choice;
        do {
            menuShow();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Student student = SetInForObject.setInForStudent();
                    studentManager.addNewStudent(student);
                    break;
                case 2:
                    studentManager.showAll(studentList);
                    break;
                case 3:
                    studentManager.showStudentHaveMarkAvgBiggestAndSmallLess();
                    break;
                case 4:
                    System.out.println("Nhập mã sinh viên bạn cần tìm kiếm");
                    String idNeedFind = sc.nextLine();
                    studentManager.findStudentById(idNeedFind);
                    break;
                case 5:
                    studentManager.sortByName();
                    break;
                case 6:
                    studentManager.showStudentHaveScholarship();
                    break;
                case 7:
                    studentManager.readFile();
                    break;
                case 0:
                    System.out.println("Thóat chương trình");
                    break;
            }

        } while (choice != 0);
    }

    private static void menuShow() {
        System.out.println("1.Thêm sinh viên và lưu");
        System.out.println("2.Hiển thị tất cả");
        System.out.println("3.hiển thị sinh viên có điểm cao nhất và điểm thấp nhất");
        System.out.println("4.Tìm kiếm sinh viên theo mã");
        System.out.println("5.Sắp xếp sinh viên theo tên");
        System.out.println("6.Hiển thị và sắp xếp danh sách sinh viên có học bổng");
        System.out.println("7.Đọc file sinh viên đã ghi trước");
        System.out.println("0.Thoát chương trình");
        System.out.println("Nhập lựa trọn choice");
    }
}
