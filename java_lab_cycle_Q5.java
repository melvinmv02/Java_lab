import java.util.Scanner;

public class java_lab_cycle_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double da = basicSalary * 0.10;
        double hra = basicSalary * 0.15;
        double grossSalary = basicSalary + da + hra;

        System.out.println("\nDA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("Gross Salary = " + grossSalary);

        sc.close();
    }
}