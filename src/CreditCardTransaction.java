public class CreditCardTransaction extends Payment{
    private String nameOnCard;

    public CreditCardTransaction(Integer paymentID, double amount, String nameOnCard) {
        super(paymentID, amount);
        this.nameOnCard = nameOnCard;
    }

    @Override
    public boolean makeTransaction() {
        setStatus(PaymentStatus.COMPLETED);
        return true;
    }
}
