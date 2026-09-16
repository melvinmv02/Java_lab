// Concept: Interfaces, Multiple Interface Implementation,
// Interface References and Interfaces vs Abstract Classes

import java.util.Scanner;

// Payable interface
interface Payable {

    void makePayment(double amount);
}

// Printable interface
interface Printable {

    void printDocument();
}

// Invoice implements both interfaces
class Invoice implements Payable, Printable {

    String invoiceNumber;
    double invoiceAmount;

    Invoice(String invoiceNumber, double invoiceAmount) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceAmount = invoiceAmount;
    }

    // Implementation of Payable method
    @Override
    public void makePayment(double amount) {

        if (amount > 0 && amount <= invoiceAmount) {

            System.out.println(
                    "Payment of Rs. " + amount +
                            " made successfully."
            );

        } else {

            System.out.println(
                    "Invalid payment amount."
            );
        }
    }

    // Implementation of Printable method
    @Override
    public void printDocument() {

        System.out.println("\n===== INVOICE =====");
        System.out.println(
                "Invoice Number: " + invoiceNumber
        );
        System.out.println(
                "Invoice Amount: Rs. " + invoiceAmount
        );
    }
}

public class PayablePrintable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking invoice details from user
        System.out.print("Enter invoice number: ");
        String invoiceNumber = sc.nextLine();

        System.out.print("Enter invoice amount: ");
        double invoiceAmount = sc.nextDouble();

        // Creating Invoice object
        Invoice invoice =
                new Invoice(invoiceNumber, invoiceAmount);

        // Calling both interface methods
        invoice.printDocument();

        System.out.print("Enter payment amount: ");
        double payment = sc.nextDouble();

        invoice.makePayment(payment);

        // Interface reference
        Payable payable = invoice;

        System.out.print(
                "Enter another payment amount: "
        );

        double anotherPayment = sc.nextDouble();

        // Calling method through Payable reference
        payable.makePayment(anotherPayment);

        /*
        Advantage of separate interfaces:

        Payable and Printable represent two different
        behaviors.

        A class can implement one or both interfaces
        depending on what it needs.

        Unlike an abstract class, a Java class can
        implement multiple interfaces.
        */

        sc.close();
    }
}