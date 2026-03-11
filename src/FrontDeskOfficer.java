public class FrontDeskOfficer extends Person{

    public FrontDeskOfficer(String name, Address address, String email, String phone, Account account) {
        super(name, address, email, phone, account);
    }
    public boolean createItinerary(Customer customer, Itinerary itinerary) {
        customer.addItinerary(itinerary);
        return true;
    }
    
}
