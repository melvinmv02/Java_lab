import java.util.Scanner;

public class java_lab_cycle_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading input
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        // Calculating Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Calculating Total Amount
        double amount = principal + simpleInterest;

        // Displaying output
        System.out.println("\nSimple Interest = " + simpleInterest);
        System.out.println("Amount = " + amount);

        sc.close();
    }
}