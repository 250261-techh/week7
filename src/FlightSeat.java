public class FlightSeat extends Seat {
    private double fare;
    private String reservationNumber;
    public FlightSeat(String seatNumber, SeatType type, SeatClass _class, double fare) {
        super(seatNumber, type, _class);
        this.fare = fare;
    }
    public double getFare(){
        return fare;
    }
    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }
}
