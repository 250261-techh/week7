import java.sql.Time;
import java.util.Date;

public class Seat {
    private String seatNumber;
    private SeatType type;
    private SeatClass _class;
    public Seat(String seatNumber, SeatType type, SeatClass _class) {
        this.seatNumber = seatNumber;
        this.type = type;
        this._class = _class;
    }
    public SeatType getSeatType() {
        return type;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public SeatClass getSeatClass() {
        return _class;
    }
}

