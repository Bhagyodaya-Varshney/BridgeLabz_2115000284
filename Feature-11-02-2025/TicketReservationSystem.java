public class TicketReservationSystem {
    public static void main(String[] args) {
		
        Ticket ticket = new Ticket(5001, "Anuj", "ABCD", 20, "09:00 AM");
        ticket = Ticket.addTicket(5002, "Kunal", "ABCD2", 25, "12:00 PM", ticket);
        ticket = Ticket.addTicket(5003, "Bhagyodaya", "ABCD3", 28, "3:00 PM", ticket);

        System.out.println("Current Tickets:");
        Ticket.displayTickets(ticket);
        System.out.println();

        ticket = Ticket.removeTicket(102, ticket);
        System.out.println("After Removing Ticket 102:");
        Ticket.displayTickets(ticket);
        System.out.println();

        System.out.println("Searching for 'Sapne':");
        Ticket.searchTicketByMovie("Sapne", ticket);
        System.out.println();

        System.out.println("Total Booked Tickets: " + Ticket.countTotalTickets(ticket));
    }
}

class Ticket {
    int ticketId, seatNumber;
    String customerName, movieName, bookingTime;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = this;
    }

    public static Ticket addTicket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime, Ticket ticket) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);

        if (ticket == null) {
            return newTicket;
        }

        Ticket temp = ticket;
        while (temp.next != ticket) {
            temp = temp.next;
        }

        temp.next = newTicket;
        newTicket.next = ticket;
        return ticket;
    }

    public static Ticket removeTicket(int ticketId, Ticket ticket) {
        if (ticket == null) return null;

        Ticket temp = ticket, prev = null;

        do {
            if (temp.ticketId == ticketId) {
                if (temp == ticket && temp.next == ticket) {
                    return null;
                }

                if (temp == ticket) {
                    Ticket last = ticket;
                    while (last.next != ticket) {
                        last = last.next;
                    }
                    ticket = ticket.next;
                    last.next = ticket;
                } else {
                    prev.next = temp.next;
                }
                return ticket;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != ticket);

        System.out.println("Ticket ID " + ticketId + " not found.");
        return ticket;
    }

    public static void searchTicketByMovie(String movieName, Ticket ticket) {
        if (ticket == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket temp = ticket;
        boolean found = false;

        do {
            if (temp.movieName.equalsIgnoreCase(movieName)) {
                System.out.println("Ticket ID: "+temp.ticketId);
				System.out.println("Customer Name: "+temp.customerName);
				System.out.println("Movie Name: "+temp.movieName);
				System.out.println("Seat Number: "+temp.seatNumber);
				System.out.println("Booking Time: "+temp.bookingTime);
				System.out.println();
                found = true;
            }
            temp = temp.next;
        } while (temp != ticket);

        if (!found) {
            System.out.println("No ticket found for movie: " + movieName);
        }
    }

    public static int countTotalTickets(Ticket ticket) {
        if (ticket == null) return 0;

        int count = 0;
        Ticket temp = ticket;

        do {
            count++;
            temp = temp.next;
        } while (temp != ticket);

        return count;
    }

    public static void displayTickets(Ticket ticket) {
        if (ticket == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket temp = ticket;
        do {
            System.out.println("Ticket ID: "+temp.ticketId);
            System.out.println("Customer Name: "+temp.customerName);
            System.out.println("Movie Name: "+temp.movieName);
            System.out.println("Seat Number: "+temp.seatNumber);
            System.out.println("Booking Time: "+temp.bookingTime);
            System.out.println();
            temp = temp.next;
        } while (temp != ticket);
    }
}
