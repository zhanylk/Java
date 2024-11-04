package Tasks.Customer;

public class VIPCustomer extends Customer{
    private static final double DISCOUNT_RATE = 0.1; // 10% скидка

    public VIPCustomer(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void payBill(double amount) {
        double discountedAmount = amount * (1 - DISCOUNT_RATE);
        if (balance >= discountedAmount) {
            balance -= discountedAmount;
            System.out.println(name + " оплатил " + discountedAmount + " остаток " + balance);
        } else {
            System.out.println(name + "баланс " + discountedAmount);
        }
    }
}
