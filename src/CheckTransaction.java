public class CheckTransaction extends Payment{
    private String bankName;
    private String checkNumber;
    public CheckTransaction(Integer paymentID, double amount,String bankName, String checkNumber) {
        super(paymentID, amount);
        this.bankName = bankName;
        this.checkNumber = checkNumber;
    }

    @Override
    public boolean makeTransaction() {
        setStatus(PaymentStatus.COMPLETED);
        return true;
    }
}
