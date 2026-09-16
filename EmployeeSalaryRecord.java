// Concept: Access Modifiers (public, private, protected),
// Encapsulation, Getter/Setter Methods and Validation

import java.util.Scanner;

class EmployeeRecord {

    // Public field - can be accessed directly from outside
    public String name;

    // Private field - cannot be accessed directly from outside
    private double salary;

    // Protected field - accessible within the same package
    // and by subclasses
    protected String department;

    // Setter for salary with validation
    public void setSalary(double salary) {

        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println(
                    "Error: Salary cannot be negative."
            );
        }
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }
}

public class EmployeeSalaryRecord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeRecord employee =
                new EmployeeRecord();

        // Taking input from the user
        System.out.print("Enter employee name: ");
        employee.name = sc.nextLine();

        System.out.print("Enter department: ");
        employee.department = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        // Setting salary using setter
        employee.setSalary(salary);

        // Public field can be accessed directly
        System.out.println(
                "\nEmployee Name: " + employee.name
        );

        // Protected field can be accessed here
        // because this class is in the same package
        System.out.println(
                "Department: " + employee.department
        );

        // Private field is accessed through getter
        System.out.println(
                "Salary: Rs. " + employee.getSalary()
        );

        /*
        ERROR:

        System.out.println(employee.salary);

        salary is private, so it cannot be accessed
        directly from outside the EmployeeRecord class.
        We must use getSalary().
        */


        // Updating salary using setter
        System.out.print(
                "\nEnter new salary: "
        );

        double newSalary = sc.nextDouble();

        employee.setSalary(newSalary);

        System.out.println(
                "Updated Salary: Rs. "
                        + employee.getSalary()
        );


        // Trying to set a negative salary
        System.out.print(
                "\nEnter a negative salary to test validation: "
        );

        double negativeSalary = sc.nextDouble();

        employee.setSalary(negativeSalary);

        System.out.println(
                "Final Salary: Rs. "
                        + employee.getSalary()
        );

        sc.close();
    }
}