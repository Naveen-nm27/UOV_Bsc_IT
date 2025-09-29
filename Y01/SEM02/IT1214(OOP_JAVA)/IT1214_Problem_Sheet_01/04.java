class Ticket {
    private int ticketID;
    private String customerName;
    private int seatNumber;
    
    Ticket(int ticketID, String customerName, int seatNumber) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.seatNumber = seatNumber;
    }
    
    public int getTid() {
        return ticketID;
    }
    
    public String getCname() {
        return customerName;
    }
    
    public int getSeatnum() {
        return seatNumber;
    }
    
    public void setTid(int tid) {
        ticketID = tid;
    }
    
    public void setCname(String cName) {
        customerName = cName;
    }
    
    public void setSeatNum(int seatNum) {
        seatNumber = seatNum;
    }
}

class MovieTheater {
    int ticketID[] = new int[10];
    String cusName[] = new String[10];
    int seatBooked[] = new int[10];
    int numOfBookings = 0;
    
    public boolean validateSeatNum(int ticketNum) {
        for (int i = 0; i < numOfBookings; i++) {
            if (ticketNum == ticketID[i]) {
                return false;
            }
        }
        return true;
    }
    
    public boolean validateSeatNumber(int seatNum) {
        for (int i = 0; i < numOfBookings; i++) {
            if (seatNum == seatBooked[i]) {
                return false;
            }
        }
        return true;
    }
    
    public void bookTickets(Ticket ticket) {
        try {
            if (numOfBookings < 10 && validateSeatNum(ticket.getTid()) && validateSeatNumber(ticket.getSeatnum())) {
                ticketID[numOfBookings] = ticket.getTid();
                cusName[numOfBookings] = ticket.getCname();
                seatBooked[numOfBookings] = ticket.getSeatnum();
                numOfBookings++;
            } else if (!validateSeatNumber(ticket.getSeatnum())) {
                throw new IllegalArgumentException("Seat number " + ticket.getSeatnum() + " is already booked. Please choose another seat.");
            } else {
                throw new IllegalArgumentException("We are Sorry to inform that we are fully booked for today!\nTry again on the next showing time Thank you.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cancelSeat(int t01) {
        try {
            boolean found = false;
            for (int i = 0; i < numOfBookings; i++) {
                if (t01 == ticketID[i]) {
                    found = true;
                    System.out.println("Canceling ticket ID " + t01 + " for " + cusName[i] + " at seat " + seatBooked[i]);
                    for (int k = i; k < numOfBookings - 1; k++) {
                        ticketID[k] = ticketID[k + 1];
                        cusName[k] = cusName[k + 1];
                        seatBooked[k] = seatBooked[k + 1];
                    }
                    numOfBookings--;
                    System.out.println("Your booking has been canceled!");
                    break;
                }
            }
            if (!found) {
                throw new IllegalArgumentException("Invalid ticket id! Try again.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void rebookCanceledSeat(int seatNumber, String newCustomerName, int newTicketId) {
        try {
            if (validateSeatNumber(seatNumber) && validateSeatNum(newTicketId)) {
                Ticket newTicket = new Ticket(newTicketId, newCustomerName, seatNumber);
                bookTickets(newTicket);
                System.out.println("Successfully rebooked seat " + seatNumber + " to " + newCustomerName);
            } else if (!validateSeatNumber(seatNumber)) {
                throw new IllegalArgumentException("Cannot rebook: Seat " + seatNumber + " is already occupied.");
            } else {
                throw new IllegalArgumentException("Cannot rebook: Ticket ID " + newTicketId + " already exists.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void printSeats() {
        if (numOfBookings == 0) {
            System.out.println("No seats booked yet.");
            return;
        }
        
        System.out.println("Current Bookings:");
        for (int i = 0; i < numOfBookings; i++) {
            System.out.println("Seat Id: " + ticketID[i]);
            System.out.println("Name: " + cusName[i]);
            System.out.println("Seat Number: " + seatBooked[i]);
            System.out.println("-----------------------");
        }
    }
}

class Problem04 {
    public static void main(String[] args) {
        Ticket ti_01 = new Ticket(1, "Kate", 1);
        Ticket ti_02 = new Ticket(2, "Alice", 2);
        Ticket ti_03 = new Ticket(3, "Bishop", 3);
        
        MovieTheater mov01 = new MovieTheater();
        
        mov01.bookTickets(ti_01);
        mov01.bookTickets(ti_02);
        mov01.bookTickets(ti_03);
        
        mov01.printSeats();
        
        mov01.cancelSeat(2);
            
        mov01.printSeats();
    
        mov01.rebookCanceledSeat(2, "David", 4);
        
        mov01.printSeats();
    }
}