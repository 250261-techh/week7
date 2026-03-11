import java.util.Date;

public class PostalNotification extends Notification{
    private Address address;
    public PostalNotification(Integer notificationID, Date createdOn, String content, Address address) {
        super(notificationID, createdOn, content);
        this.address = address;
    }

    @Override
    public boolean send() {
        return true;
    }
}
