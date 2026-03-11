import java.util.Date;

public class FlightInstance {
    private Date departureTime;
    private String gate;
    private FlightStatus status;
    private Aircraft aircraft;
    private List<FlightReservation> reservations = new ArrayList<>();
    public FlightInstance(Date departureTime, String gate, Aircraft aircraft) {
        this.departureTime = departureTime;
        this.gate = gate;
        this.status = FlightStatus.SCHEDULED;
        this.aircraft=aircraft;
    }
    public void updateStatus(FlightStatus status){
        this.status = status;
    }
    public boolean cancel() {
        this.status = FlightStatus.CANCELLED;
        for(FlightReservation res : reservations) {
            res.setStatus(ReservationStatus.CANCELLED);
            Notification alert = new EmailNotification(101, new Date, "URGENT: Your flight has been cancelled.", "passenger@email.com");
            alert.send();
        }
        return true;
    }
}
