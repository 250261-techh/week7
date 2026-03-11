import java.util.Date;

public class FlightInstance {
    private Date departureTime;
    private String gate;
    private FlightStatus status;
    private Aircraft aircraft;
    public FlightInstance(Date departureTime, String gate, Aircraft aircraft) {
        this.departureTime = departureTime;
        this.gate = gate;
        this.status = FlightStatus.SCHEDULED;
        this.aircraft=aircraft;
    }
    public boolean cancel(){
        this.status = FlightStatus.CANCELLED;
        return true;
    }
    public void updateStatus(FlightStatus status){
        this.status = status;
    }
}
