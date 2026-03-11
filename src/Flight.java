import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String flightNumber;
    private Airport departure;
    private Airport arrival;
    private int durationInMinutes;
    private List<WeeklySchedule> weeklySchedules;
    private List<CustomSchedule> customSchedules;
    private List<FlightInstance> flightInstances;
    public Flight(String flightNumber, Airport departure, Airport arrival, int durationInMinutes) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
        this.durationInMinutes = durationInMinutes;
        this.weeklySchedules = new ArrayList<>();
        this.customSchedules = new ArrayList<>();
        this.flightInstances = new ArrayList<>();
    }
    public List<FlightInstance> getInstances() {
        return flightInstances;
    }
    public boolean cancel(){
        for (FlightInstance instance : flightInstances) {
            instance.cancel();
        }
        return true;
    }
    public boolean addFlightSchedule(WeeklySchedule schedule) {
        return weeklySchedules.add(schedule);
    }
    public String getFlightNumber() {
        return flightNumber;
    }


}

