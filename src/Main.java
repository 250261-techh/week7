import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Airline management system started ");
        
        Address uzbAddress = new Address("1 Amir Temur Ave", "Tashkent", "Tashkent", "100000", "Uzbekistan");
        Address nyAddress = new Address("Queens", "New York", "NY", "11430", "USA");
        Account dummyAcc = new Account("user1", "pass123");

        Airline uzbAirways = new Airline("Uzbekistan Airways", "HY");
        Airport tas = new Airport("Tashkent International", uzbAddress, "TAS");
        Airport jfk = new Airport("JFK International", nyAddress, "JFK");

        System.out.println("Admin adding aircraft AND flights");
        Admin admin = new Admin("System Admin", uzbAddress, "admin@hy.com", "+998900000001", dummyAcc);
        
        Aircraft boeing787 = new Aircraft("Boeing 787 Dreamliner", "787-8", 2020);
        boeing787.addSeat(new Seat("1A", SeatType.EXTRA_LEG_ROOM, SeatClass.BUSINESS));
        boeing787.addSeat(new Seat("1B", SeatType.REGULAR, SeatClass.BUSINESS));
        
        admin.addAircraft(boeing787, uzbAirways);

        Flight hy101 = new Flight("HY101", tas, jfk, 720);
        FlightInstance hy101_today = new FlightInstance(new Date(), "Gate 4", boeing787);
        hy101.getInstances().add(hy101_today);
        admin.addFlight(hy101, uzbAirways);
        System.out.println();

        System.out.println("Assigning pilots and crew");
        Pilot chiefPilot = new Pilot("Capt. Timur", uzbAddress, "timur@hy.com", "+998900000002", dummyAcc);
        Crew leadStewardess = new Crew("Malika", uzbAddress, "malika@hy.com", "+998900000003", dummyAcc);
        
        chiefPilot.assignFlight(hy101_today);
        leadStewardess.assignFlight(hy101_today);
        System.out.println("Assigned Pilot: " + chiefPilot.getName() + " to Flight HY101");
        System.out.println("Assigned Crew: " + leadStewardess.getName() + " to Flight HY101\n");

        System.out.println("Customer Searching for flights and checking Seats");
        Customer customer = new Customer("John Doe", uzbAddress, "john@email.com", "+998901234567", dummyAcc, "FF-998");
        
        System.out.println("Customer searching for flights from TAS to JFK...");
        List<FlightInstance> searchResults = uzbAirways.searchFlights(tas, jfk, new Date());
        
        if (!searchResults.isEmpty()) {
            System.out.println("Success! Found flight departing at: " + new Date());
            System.out.println("Total Available Seats on Aircraft: " + boeing787.getAvailableSeatCount());
        }
        System.out.println();


        System.out.println("Creating multi-passenger itinerary");
        Passenger p1 = new Passenger("John Doe", "AA12345", new Date());
        Passenger p2 = new Passenger("Jane Doe", "BB98765", new Date());

        FlightSeat seat1A = new FlightSeat("1A", SeatType.EXTRA_LEG_ROOM, SeatClass.BUSINESS, 1200.00);
        FlightSeat seat1B = new FlightSeat("1B", SeatType.REGULAR, SeatClass.BUSINESS, 1200.00);

        FlightReservation outboundRes = new FlightReservation("RES-OUT-001", hy101_today);
        outboundRes.assignSeat(p1, seat1A);
        outboundRes.assignSeat(p2, seat1B);

        Itinerary itinerary = new Itinerary(customer.getName(), tas, jfk);
        itinerary.makeReservation(outboundRes);
        customer.addItinerary(itinerary);
        System.out.println("Itinerary created for 2 passengers under 1 reservation.\n");

        System.out.println(" Handling payments and auto-notifications");
        Payment ccPayment = new CreditCardTransaction(101, 2400.00, "John Doe");
        itinerary.makePayment(ccPayment);
        System.out.println();

        System.out.println("Customer cancelling itinerary");
        itinerary.cancelItinerary();
        System.out.println();

        System.out.println("Admin cancelling a scheduled flight ---");
        hy101_today.cancel(); 

       
        System.out.println("Airline management system shutting down";

    }
}
