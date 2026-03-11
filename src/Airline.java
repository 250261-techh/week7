import java.util.ArrayList;
import java.util.List;

public class Airline {
    private String name;
    private String code;
    private List<Flight> flights;
    private List<Aircraft> aircrafts;
    public Airline(String name, String code){
        this.name = name;
        this.code = code;
        this.flights = new ArrayList<>();
        this.aircrafts = new ArrayList<>();
    }
    public List<Flight> getFlights() {
        return flights;
    }
    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }
    public List<FlightInstance> searchFlights(Airport source, Airport destination, Date date) {
        List<FlightInstance> availableFlights = new ArrayList<>();
        
        for (Flight flight : this.flights) {
            if (flight.getDeparture().equals(source) && flight.getArrival().equals(destination)) {
                availableFlights.addAll(flight.getInstances());
            }
        }
        return availableFlights;
    }

}
