import java.util.ArrayList;
import java.util.Scanner;

public class Employeelist {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee employee = null;
        int choice;
        do {
            System.out.println("------------------------------------------------");
            System.out.println("WELCOME TO EMPLOYEE MANAGEMENT");
            System.out.println("    1. Lecturer");
            System.out.println("    2. Office");
            System.out.println("    3. View all employee's information");
            System.out.print("Which number do you want to choose? ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    employee = new Lecturer();
                    ((Lecturer) employee).input();
                    employees.add(employee);
                    break;
                case 2:
                    employee = new Office();
                    ((Office) employee).input();
                    employees.add(employee);
                    break;
                case 3:
                    for (Employee ep : employees) {
                        ep.output();
                    }
                    break;
                default:
                    System.out.println("------------------------------------------------");
                    System.out.println("WELCOME TO EMPLOYEE MANAGEMENT");
                    System.out.println("    1. Lecturer");
                    System.out.println("    2. Office");
                    System.out.println("    3. View all employee's information");
                    System.out.print("Which number do you want to choose?(1-3)");
                    choice = sc.nextInt();
                    break;
            }
        } while (choice > 0 && choice < 3);
    }
}