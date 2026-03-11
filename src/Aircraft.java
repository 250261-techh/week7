import java.util.ArrayList;
import java.util.List;

public class Aircraft {
    private String name;
    private String model;
    private int manufacturingYear;
    private List<Seat> seats;
    private List<FlightInstance> flightInstances;
    public List<FlightInstance> getFlights(){
        return flightInstances;
    }
    public Aircraft(String name, String model, int manufacturingYear){
        this.name = name;
        this.model = model;
        this.manufacturingYear = manufacturingYear;
        this.seats = new ArrayList<>();
        this.flightInstances = new ArrayList<>();

    }
    public String getName(){
        return name;
    }
    public String getModel(){
        return model;
    }
    public int getAvailableSeatCount() {
        return this.seats.size(); 
    }
}
