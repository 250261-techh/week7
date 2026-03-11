import java.util.ArrayList;
import java.util.List;

public class Crew extends Person{
    private List<FlightInstance> assignedFlights;

    public Crew(String name, Address address, String email, String phone, Account account) {
        super(name, address, email, phone, account);
        this.assignedFlights = new ArrayList<>();
    }
    public void assignFlight(FlightInstance flightInstance) {
        assignedFlights.add(flightInstance);
    }
    public List<FlightInstance> getFlights() {
        return assignedFlights;
    }
}
