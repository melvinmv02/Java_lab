import java.util.Scanner;

public class java_lab_cycle_Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading input
        System.out.print("Enter first integer (A): ");
        int A = sc.nextInt();

        System.out.print("Enter second integer (B): ");
        int B = sc.nextInt();

        // Performing arithmetic operations
        System.out.println("\nAddition = " + (A + B));
        System.out.println("Subtraction = " + (A - B));
        System.out.println("Multiplication = " + (A * B));

        // Checking division by zero
        if (B != 0) {
            System.out.println("Division = " + (A / B));
            System.out.println("Modulus = " + (A % B));
        } else {
            System.out.println("Division = Cannot divide by zero");
            System.out.println("Modulus = Cannot divide by zero");
        }

        sc.close();
    }
}