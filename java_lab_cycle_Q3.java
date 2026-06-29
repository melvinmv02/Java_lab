import java.util.Scanner;

public class java_lab_cycle_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading three numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        // Number of values
        int count = 3;

        // Avoid division by zero
        if (count != 0) {
            double average = (num1 + num2 + num3) / count;
            System.out.println("Average = " + average);
        } else {
            System.out.println("Cannot calculate average. Division by zero.");
        }

        sc.close();
    }
}
