import java.util.Scanner;

public class Lecturer extends Employee {
    int teachingHours;
    float Salary;

    public Lecturer(){
    }

    public Lecturer(String id, String name, int teachingHours){
        super(id, name);
        this.teachingHours = teachingHours;
    }

    public int getTeachingHours(){
        return teachingHours;
    }

    public void setTeachingHours(){
        this.teachingHours = teachingHours;
    }

    @Override
    public void input() {
        super.input();
        Scanner hour = new Scanner(System.in);
        System.out.println("Enter Teaching Hours: ");
        this.teachingHours = hour.nextInt();
    }

    @Override
    public void print(){
        System.out.println("==========Lecturer==========");
        super.print();
        System.out.printf("Salary: %d |" + Salary);
    }

    @Override
    double calSalary() {
    double salary = teachingHours * 25000;
    return salary;   
    }
}
