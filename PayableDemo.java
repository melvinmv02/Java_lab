interface Payable {

    void makePayment(double amount);
}


interface Printable {

    void printDocument();
}


class Invoice implements Payable, Printable {

    @Override
    public void makePayment(double amount) {

        System.out.println("Payment made: ₹" + amount);
    }

    @Override
    public void printDocument() {

        System.out.println("Invoice printed successfully.");
    }
}


public class PayableDemo {

    public static void main(String[] args) {

        Invoice invoice = new Invoice();


        invoice.makePayment(5000);
        invoice.printDocument();


        Payable payable = invoice;

        payable.makePayment(2000);


    }
}