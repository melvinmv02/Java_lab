// Concept: static Fields, static Methods, final Constants, Instance Fields and User Input

import java.util.Scanner;

class Ticket {

    // Instance field
    String passengerName;

    // Static field - shared by all Ticket objects
    static int ticketCount = 0;

    // Static final constant - fixed value
    static final double BASE_FARE = 50.0;

    // Constructor
    Ticket(String passengerName) {

        this.passengerName = passengerName;

        // Increment total ticket count
        ticketCount++;

        System.out.println(
                "Ticket booked for " + passengerName +
                        ". Ticket Number: " + ticketCount
        );
    }

    // Static method
    static void printTotalTicketsSold() {

        System.out.println(
                "Total Tickets Sold: " + ticketCount
        );
    }
}

public class BusTicketBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking passenger details from the user
        System.out.print("Enter passenger 1 name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter passenger 2 name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter passenger 3 name: ");
        String name3 = sc.nextLine();

        // Creating three Ticket objects
        Ticket ticket1 = new Ticket(name1);
        Ticket ticket2 = new Ticket(name2);
        Ticket ticket3 = new Ticket(name3);

        // Calling static method using class name
        Ticket.printTotalTicketsSold();

        /*
        ERROR:

        Ticket.BASE_FARE = 100.0;

        BASE_FARE is declared as final,
        so its value cannot be changed.
        */

        System.out.println(
                "Base Fare: Rs. " + Ticket.BASE_FARE
        );

        sc.close();
    }
}