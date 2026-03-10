public class Admin extends Person{

    Admin(String name, Address address, String email, String phone, Account account) {
        super(name, address, email, phone, account);
    }

    public boolean addAircraft(){

        return true;
    }
    public boolean addFlight(){
        return true;
    }
    public boolean blockUser(){
        return false;
    }
}

