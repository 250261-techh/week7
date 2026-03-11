import java.util.Date;

public class Passenger {
    private String name;
    private String passportNumber;
    private Date dateOfBirth;
    public String getPassportNumber() {
        return this.passportNumber;
    }
    public Passenger(String name, String passportNumber, Date dateOfBirth){
        this.name=name;
        this.passportNumber=passportNumber;
        this.dateOfBirth=dateOfBirth;
    }
    public String getName(){
        return this.name;
    }
}
