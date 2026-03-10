import java.util.List;

public class Customer extends Person{
    private String frequentFlyerNumber;

    Customer(String name, Address address, String email, String phone, Account account, String frequentFlyerNumber) {
        super(name, address, email, phone, account);
        this.frequentFlyerNumber=frequentFlyerNumber;

    }

    public List<Itinerary> getItineraries(){
        return List.of();
    }
}
