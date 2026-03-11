import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Itinerary {
    private String customerId;
    private Airport startingAirport;
    private Airport finalAirport;
    private Date creationDate;
    private List<FlightReservation> reservations;
    public List<FlightReservation> getReservations(){
        return reservations;
    }
    public Itinerary(String customerId, Airport startingAirport, Airport finalAirport) {
        this.customerId = customerId;
        this.startingAirport = startingAirport;
        this.finalAirport = finalAirport;
        this.creationDate = new Date();
        this.reservations = new ArrayList<>();
    }
    public boolean makeReservation(FlightReservation reservation) {
        reservations.add(reservation);
        reservation.setStatus(ReservationStatus.PENDING);
        return true;
    }
    public boolean makePayment(Payment payment) {
        if (payment!=null && payment.makeTransaction()){
            for (FlightReservation res : reservations) {
                res.setStatus(ReservationStatus.CONFIRMED);
            }
            return true;
        }
        return false;
    }
}
