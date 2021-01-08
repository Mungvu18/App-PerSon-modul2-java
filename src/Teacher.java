import java.io.Serializable;

public class Teacher extends Person implements Serializable {
    private String className;
    private double salaryByHour;
    private String kindOfTimeTeach;
    private double amountHourByMonth;

    public Teacher(String name, String gender, String birthday, String address, String className, double salaryByHour, double amountHourByMonth, String kindOfTimeTeach) {
        super(name, gender, birthday, address);
        this.className = className;
        this.salaryByHour = salaryByHour;
        this.amountHourByMonth = amountHourByMonth;
        this.kindOfTimeTeach = kindOfTimeTeach;
    }
    public double getSalary(){
        double salary = 0;
        if (kindOfTimeTeach.equalsIgnoreCase("g")||kindOfTimeTeach.equalsIgnoreCase("h")||kindOfTimeTeach.equalsIgnoreCase("i")||kindOfTimeTeach.equalsIgnoreCase("k")){
            salary = amountHourByMonth*salaryByHour;
        }
        if(kindOfTimeTeach.equalsIgnoreCase("l")||kindOfTimeTeach.equalsIgnoreCase("m")){
            salary = amountHourByMonth*salaryByHour+200;
        }
        return salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                "className='" + className + '\'' +
                ", salaryByHour=" + salaryByHour +
                ", amountHourByMonth=" + amountHourByMonth +
                '}';
    }
}
