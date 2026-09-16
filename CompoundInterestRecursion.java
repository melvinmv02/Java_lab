// Concept: Recursion, Base Case, Recursive Case, Call Stack and User Input

import java.util.Scanner;

public class CompoundInterestRecursion {

    // Recursive method to calculate compound interest
    static double calculateAmount(double principal, double rate, int years) {

        // Base case
        if (years == 0) {
            return principal;
        }

        // Recursive case
        principal = principal + (principal * rate / 100);

        return calculateAmount(principal, rate, years - 1);
    }

    // Recursive method to calculate factorial
    static int factorial(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        // Calling recursive compound interest method
        double finalAmount =
                calculateAmount(principal, rate, years);

        System.out.println(
                "Final Amount = " + finalAmount
        );

        // Calling recursive factorial method
        System.out.println(
                "Factorial of 6 = " + factorial(6)
        );

        sc.close();
    }
}