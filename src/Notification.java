import java.util.Date;

public abstract class Notification {
    private Integer notificationID;
    private Date createdOn;
    private String content;
    public Notification(Integer notificationID, Date createdOn, String content) {
        this.notificationID = notificationID;
        this.createdOn = new Date();
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    public abstract boolean send();
}
