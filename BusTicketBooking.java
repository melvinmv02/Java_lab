

import java.util.Scanner;

class Ticket {

    
    String passengerName;

    // Static field - shared by all Ticket objects
    static int ticketCount = 0;

    // Static final constant - fixed value
    static final double BASE_FARE = 50.0;


    Ticket(String passengerName) {

        this.passengerName = passengerName;

        
        ticketCount++;

        System.out.println(
                "Ticket booked for " + passengerName +
                        ". Ticket Number: " + ticketCount
        );
    }

    
    static void printTotalTicketsSold() {

        System.out.println(
                "Total Tickets Sold: " + ticketCount
        );
    }
}

public class BusTicketBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter passenger 1 name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter passenger 2 name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter passenger 3 name: ");
        String name3 = sc.nextLine();

       
        Ticket ticket1 = new Ticket(name1);
        Ticket ticket2 = new Ticket(name2);
        Ticket ticket3 = new Ticket(name3);

       
        Ticket.printTotalTicketsSold();

     

     

        System.out.println(
                "Base Fare: Rs. " + Ticket.BASE_FARE
        );

        sc.close();
    }
}
