import java.util.Scanner;

public class java_lab_cycle_Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = sc.nextInt();

        System.out.print("Enter B: ");
        int b = sc.nextInt();

        System.out.println("\nBefore Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        sc.close();
    }
}