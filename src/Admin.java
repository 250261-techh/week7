public class Admin extends Person{

    public Admin(String name, Address address, String email, String phone, Account account) {
        super(name, address, email, phone, account);
    }

    public boolean addAircraft(Aircraft aircraft, Airline airline){
        airline.getAircrafts().add(aircraft);
        return true;
    }
    public boolean addFlight(Flight flight, Airline airline){
        airline.getFlights().add(flight);
        return true;
    }
    public boolean blockUser(Person person){
        person.getAccount().setStatus(AccountStatus.BLOCKED);
        return true;
    }
}

