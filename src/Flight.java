import java.util.Date;
import java.util.List;

public class Flight {
    private String flightNumber;
    private Airport departure;
    private Airport arrival;
    private int durationInMinutes;
    private List<WeeklySchedules> weeklySchedules;
    private List<CustomSchedules> customSchedules;
    private List<FlightInstance> flightInstances;
}


public class FlightInstance {
    private Date departureTime;
    private String gate;
    private FlightStatus status;
    private Aircraft aircraft;
    public bool cancel();
    public void updateStatus(FlightStatus status);
}

public class FlightReservation {
    private String reservationNumber;
    private FlightInstance flight;
    private Map<Passenger, FlightSeat> seatMap;
    private Date creationDate;
    private ReservationStatus status;
    public static FlightReservation fetchReservationDetails(String
                                                                    reservationNumber);
    public List<Passenger> getPassengers();
}