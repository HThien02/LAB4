import java.util.Scanner;

/**
 * Employee
 */
public abstract class Employee {
    protected String id;
    protected String name;
    protected int type;

    public Employee() {
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Employee ID: ");
        this.id = sc.nextLine();

        System.out.println("Enter Employee Name: ");
        this.name = sc.nextLine();
    }

    public void print() {
        System.out.printf("%s | %s |", id, name);
    }
    abstract double calSalary();

    public void output() {
    }
}
