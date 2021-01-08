import java.util.Scanner;

public class SetInForObject {
    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);

    public static Person setInFoPerson(){
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        System.out.println("Nhập giới tính");
        String gender = sc1.nextLine();
        System.out.println("Nhập ngày sinh");
        String birthday = sc.nextLine();
        System.out.println("Địa chỉ");
        String address = sc1.nextLine();
        Person person = new Person(name,gender,birthday,address);
        return person;
    }
    public static Student setInForStudent(){
        Person person = setInFoPerson();
        System.out.println("Nhập mã sinh viên");
        String studentId = sc.nextLine();
        double markAvg = -1;
        while (markAvg<0||markAvg>10) {
            System.out.println("Nhập điểm trung bình");
            markAvg = Double.parseDouble(sc1.nextLine());
        }
        String email = null;
        do {
            System.out.println("Nhập email");
            email = sc.nextLine();
        } while (!email.contains("@")||email.contains("\t"));
        Student student = new Student(person.getName(),person.getGender(),
                person.getBirthday(),person.getAddress(),studentId,markAvg,email);
        return student;
    }
    public static Teacher setInForTeacher(){
        Person person = setInFoPerson();
        System.out.println("Nhập tên lớp đứng giảng");
        String className = sc.nextLine();
        System.out.println("Nhập lương theo giờ giảng");
        double salaryByHour = Double.parseDouble(sc1.nextLine());
        System.out.println("Nhập giờ dạy giảng dạy sáng chiều [G,H,I,K] buổi tối là[L,M]");
        String kindOfTimeTeach = sc.nextLine();
        System.out.println("Nhập số giờ dạy trong 1 tháng");
        int  amountHourByMonth =Integer.parseInt(sc1.nextLine());
        Teacher teacher = new Teacher(person.getName(),person.getGender(),
                person.getBirthday(),person.getAddress(),className,salaryByHour,amountHourByMonth,kindOfTimeTeach);
        return teacher;
    }
}
