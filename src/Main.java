import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Airline management system started");
        Address custAddress = new Address("123 Main St", "Tashkent", "Tashkent Region", "100000", "Uzbekistan");
        Account custAccount = new Account("user123", "securePass1!");
        Customer customer = new Customer("John Doe", custAddress, "john.doe@email.com", "+998901234567", custAccount, "FF-99812");

        Airline uzbekistanAirways = new Airline("Uzbekistan Airways", "HY");
        Airport tas = new Airport("Tashkent International", custAddress, "TAS");
        Airport jfk = new Airport("JFK International", new Address("Queens", "NY", "NY", "11430", "USA"), "JFK");
        Aircraft boeing787 = new Aircraft("Boeing 787 Dreamliner", "787-8", 2018);

        Flight hy101 = new Flight("HY101", tas, jfk, 720);
        FlightInstance flightInstance = new FlightInstance(new Date(), "Gate 4", boeing787);

        Passenger p1 = new Passenger("John Doe", "AA1234567", new Date());
        FlightSeat seat1A = new FlightSeat("1A", SeatType.EXTRA_LEG_ROOM, SeatClass.BUSINESS, 1200.00);
        FlightReservation reservation = new FlightReservation("RES-001", flightInstance);

        reservation.assignSeat(p1, seat1A);
        Itinerary itinerary = new Itinerary(customer.getName(), tas, jfk);
        itinerary.makeReservation(reservation);

        customer.addItinerary(itinerary);
        System.out.println("Reservation for: " + customer.getName());
        System.out.println("Current Reservation Status: " + reservation.getStatus() + "\n");
        System.out.println("Processing payments");
        Payment ccPayment = new CreditCardTransaction(101, 1200.00, "John Doe");
        itinerary.makePayment(ccPayment);
        System.out.println("Updated Reservation Status: " + reservation.getStatus() + "\n");
        System.out.println("Sending Notifications");
        flightInstance.updateStatus(FlightStatus.DELAYED);
        String delayMessage = "Attention: Flight HY101 has been delayed.";
        Notification[] notifications = new Notification[] {
                new EmailNotification(1, new Date(),delayMessage, customer.getEmail()),
                new SmsNotification(2, new Date(),delayMessage, "+998901234567"),
                new PostalNotification(3, new Date(),delayMessage, custAddress)
        };
        for (Notification notification : notifications) {
            notification.send();
        }
        System.out.println("Airline management system shutting down");

    }


    }
