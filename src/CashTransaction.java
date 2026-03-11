public class CashTransaction extends Payment{
    private double cashTendered;
    public CashTransaction(Integer paymentID, double amount, double cashTendered) {
        super(paymentID, amount);
        this.cashTendered = cashTendered;
    }

    @Override
    public boolean makeTransaction() {
        if (cashTendered >= getAmount()){
            setStatus(PaymentStatus.COMPLETED);
            return true;
        }
        else {
            setStatus(PaymentStatus.DECLINED);
            return false;
        }
    }
}
