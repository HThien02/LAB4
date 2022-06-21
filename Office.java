import java.util.Scanner;

public class Office extends Employee {
double coefficientsSalary;
    float Salary;

    public Office(){
    }

    public Office(String id, String name,  Double coefficientsSalary){
        super(id, name);
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getCoefficientsSalary(){
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(){
        this.coefficientsSalary = coefficientsSalary;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Teaching Hours: ");
        this.coefficientsSalary = sc.nextDouble();
    }

    @Override
    public void print(){
        System.out.println("==========Office==========");
        super.print();
        System.out.printf("Salary: %d |" + calSalary());
    }

    @Override
    double calSalary() {
    double salary = coefficientsSalary * 25000;
    return salary;   
    }
}
