import java.io.*;
import java.util.Scanner;

import toolkit.utils.MathHelper;
import toolkit.utils.StringHelper;

// Abstract class
abstract class Employee {

    String name;
    int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    abstract double calculateSalary();

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

// Interfaces
interface Payable {
    void makePayment(double amount) throws InvalidPaymentException;
}

interface Printable {
    void printDocument();
}

// Custom exception
class InvalidPaymentException extends Exception {

    InvalidPaymentException(String message) {
        super(message);
    }
}

// Manager inherits Employee and implements two interfaces
class Manager extends Employee implements Payable, Printable {

    int teamSize;
    double salary;

    Manager(String name, int employeeId, int teamSize, double salary) {

        super(name, employeeId);

        this.teamSize = teamSize;
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        return salary;
    }

    @Override
    void displayInfo() {

        // Calls displayInfo() of Employee
        super.displayInfo();

        System.out.println("Team Size: " + teamSize);
        System.out.println("Salary: ₹" + salary);
    }

    @Override
    public void makePayment(double amount)
            throws InvalidPaymentException {

        if (amount <= 0) {
            throw new InvalidPaymentException(
                    "Payment amount must be positive."
            );
        }

        if (amount > salary) {
            throw new InvalidPaymentException(
                    "Payment cannot be greater than salary."
            );
        }

        System.out.println("Payment made successfully: ₹" + amount);
    }

    @Override
    public void printDocument() {
        System.out.println("Employee payroll document printed.");
    }
}

// Parent class for bonus rules
class PayrollRule {

    final double calculateBaseBonus(double salary) {

        return salary * 0.05;
    }

    double calculateExtraBonus(double salary) {

        return salary * 0.02;
    }
}

// Manager-specific payroll
class ManagerPayroll extends PayrollRule {

    @Override
    double calculateExtraBonus(double salary) {

        return salary * 0.05;
    }

    /*
    // ERROR: Cannot override a final method.

    @Override
    double calculateBaseBonus(double salary) {
        return salary * 0.10;
    }
    */
}

// Final class
final class FinalManager {

    void showMessage() {
        System.out.println("This class cannot be inherited.");
    }
}

/*
class SeniorManager extends FinalManager {

    // ERROR: Cannot inherit from final class FinalManager

}
*/

public class EmployeeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ============================
        // GET EMPLOYEE DETAILS
        // ============================

        System.out.println("===== ENTER EMPLOYEE DETAILS =====");

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee ID: ");
        int employeeId = sc.nextInt();

        System.out.print("Enter team size: ");
        int teamSize = sc.nextInt();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();


        // ============================
        // RUNTIME POLYMORPHISM
        // ============================

        Employee employee =
                new Manager(name, employeeId, teamSize, salary);

        System.out.println("\n===== EMPLOYEE INFORMATION =====");

        employee.displayInfo();

        System.out.println("Calculated Salary = ₹"
                + employee.calculateSalary());


        // ============================
        // INTERFACE DEMO
        // ============================

        Manager manager = (Manager) employee;

        System.out.println("\n===== INTERFACE DEMO =====");

        manager.printDocument();


        // ============================
        // PAYROLL
        // ============================

        PayrollRule payroll =
                new ManagerPayroll();

        double employeeSalary =
                employee.calculateSalary();

        System.out.println("\n===== PAYROLL =====");

        System.out.println("Base Bonus = ₹"
                + payroll.calculateBaseBonus(employeeSalary));

        System.out.println("Extra Bonus = ₹"
                + payroll.calculateExtraBonus(employeeSalary));


        // ============================
        // PAYMENT + EXCEPTION
        // ============================

        System.out.println("\n===== PAYMENT =====");

        System.out.print("Enter payment amount: ");
        double payment = sc.nextDouble();

        try {

            manager.makePayment(payment);

        } catch (InvalidPaymentException e) {

            System.out.println("Payment Error: "
                    + e.getMessage());

        } finally {

            System.out.println(
                    "Transaction attempt complete."
            );
        }


        // ============================
        // PACKAGE DEMO
        // ============================

        System.out.println("\n===== UTILITY PACKAGE =====");

        System.out.print("Enter a number to find its square: ");
        int number = sc.nextInt();

        System.out.println("Square = "
                + MathHelper.square(number));

        sc.nextLine();

        System.out.print("Enter a word to reverse: ");
        String word = sc.nextLine();

        System.out.println("Reversed = "
                + StringHelper.reverse(word));


        // ============================
        // FILE I/O - WRITE
        // ============================

        System.out.println("\n===== FEEDBACK =====");

        System.out.print("Enter employee feedback: ");
        String feedback = sc.nextLine();

        try (BufferedWriter writer =
                     new BufferedWriter(
                             new FileWriter(
                                     "feedback.txt", true))) {

            writer.write(feedback);
            writer.newLine();

            System.out.println(
                    "Feedback saved successfully."
            );

        } catch (IOException e) {

            System.out.println(
                    "Error writing to file: "
                            + e.getMessage()
            );
        }


        // ============================
        // FILE I/O - READ
        // ============================

        System.out.println("\n===== STORED FEEDBACK =====");

        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(
                                     "feedback.txt"))) {

            String line;
            int count = 1;

            while ((line = reader.readLine()) != null) {

                System.out.println(
                        count + ". " + line
                );

                count++;
            }

        } catch (IOException e) {

            System.out.println(
                    "Error reading file: "
                            + e.getMessage()
            );
        }

        sc.close();
    }
}