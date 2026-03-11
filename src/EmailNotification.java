import java.util.Date;

public class EmailNotification extends Notification {
    private String email;
    public EmailNotification(Integer notificationID, Date createdOn, String content, String email) {
        super(notificationID, createdOn, content);
        this.email = email;
    }

    @Override
    public boolean send() {
        return true;
    }
}
