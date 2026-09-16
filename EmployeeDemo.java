import java.util.Scanner;

class Employee {

    String name;
    double salary;

    // Parameterized constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        // Creating Employee object using parameterized constructor
        Employee employee = new Employee(name, salary);

        employee.display();

        sc.close();
    }
}