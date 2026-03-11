import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class FlightReservation {
    private String reservationNumber;
    private FlightInstance flight;
    private Map<Passenger, FlightSeat> seatMap;
    private Date creationDate;
    private ReservationStatus status;
    private static Map<String, FlightReservation> reservationDB = new HashMap<>();
    public FlightReservation(String reservationNumber, FlightInstance flight) {
        this.reservationNumber = reservationNumber;
        this.flight = flight;
        this.seatMap = new HashMap<>();
        this.creationDate = new Date();
        this.status=ReservationStatus.REQUESTED;
        reservationDB.put(reservationNumber, this);
    }
    public static FlightReservation fetchReservationDetails(String reservationNumber){
        return reservationDB.get(reservationNumber);
    }
    public List<Passenger> getPassengers(){
        return new ArrayList<>(seatMap.keySet());
    }
    public void setStatus(ReservationStatus status) {
        this.status = status;
        Notification updateAlert = new SmsNotification(202, new Date(), "Your reservation status is now: " + status, "+1234567890");
        updateAlert.send();
    }
    public ReservationStatus getStatus() {
        return this.status;
    }
    public void assignSeat(Passenger passenger, FlightSeat seat) {
        seatMap.put(passenger, seat);
        seat.setReservationNumber(this.reservationNumber);
    }
    

}
