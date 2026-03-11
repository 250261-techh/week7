public abstract class Payment {
    private Integer paymentID;
    private double amount;
    private PaymentStatus status;
    public Payment(Integer paymentID, double amount ) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.status = PaymentStatus.UNPAID;
    }
    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
    public double getAmount() {
        return amount;
    }
    public abstract boolean makeTransaction();
}
